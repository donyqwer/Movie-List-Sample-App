package com.dtms.movielistsampleapp.movies;

import java.util.ArrayList;
import java.util.List;

public class MoviesActivityModel implements MoviesActivityMVP.Model {
    private MoviesRepository repository;

    public MoviesActivityModel(MoviesRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ViewModel> getDummyData() {
        return repository.getDummyData();
    }
}