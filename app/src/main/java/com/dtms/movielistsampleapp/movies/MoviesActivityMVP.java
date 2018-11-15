package com.dtms.movielistsampleapp.movies;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;

public interface MoviesActivityMVP {
    interface View {

        void updateData(ViewModel viewModel);

        void showSnackbar(String s);

    }

    interface Presenter {

        void loadData();

        void rxUnsubscribe();

        void setView(MoviesActivityMVP.View view);

    }

    interface Model {

        Observable<ViewModel> result();

    }
}
