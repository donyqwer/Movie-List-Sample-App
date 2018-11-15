package com.dtms.movielistsampleapp.movies;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.disposables.Disposable;

public class MoviesActivityPresenter implements MoviesActivityMVP.Presenter {

    private MoviesActivityMVP.View view;
    private MoviesActivityMVP.Model model;
    private Disposable subscription = null;

    public MoviesActivityPresenter(MoviesActivityMVP.Model model) {
        this.model = model;
    }

    @Override
    public void loadData() {
        subscription = model.result()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<ViewModel>(){
                    @Override
                    public void onNext(ViewModel viewModel) {
                        if (view != null) {
                            view.updateData(viewModel);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        if (view != null) {
                            view.showSnackbar("Error getting movies");
                        }
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void rxUnsubscribe() {
        if (subscription != null) {
            if (!subscription.isDisposed()) {
                subscription.dispose();
            }
        }
    }

    @Override
    public void setView(MoviesActivityMVP.View view) {
        this.view = view;
    }
}
