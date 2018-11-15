package com.dtms.movielistsampleapp.movies;

public class MoviesActivityPresenter implements MoviesActivityMVP.Presenter {
    private MoviesActivityMVP.View view;
    private MoviesActivityMVP.Model model;

    public MoviesActivityPresenter(MoviesActivityMVP.Model model) {
        this.model = model;
    }

    @Override
    public void loadData() {
        view.showData(model.getDummyData());
        view.showSnackbar("Success load data!");
    }

    @Override
    public void setView(MoviesActivityMVP.View view) {
        this.view = view;
    }
}
