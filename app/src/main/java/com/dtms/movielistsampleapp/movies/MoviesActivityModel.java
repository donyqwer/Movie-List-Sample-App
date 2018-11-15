package com.dtms.movielistsampleapp.movies;

import com.dtms.movielistsampleapp.http.apimodel.Result;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;

public class MoviesActivityModel implements MoviesActivityMVP.Model {
    private MoviesRepository repository;

    public MoviesActivityModel(MoviesRepository repository) {
        this.repository = repository;
    }


    @Override
    public Observable<ViewModel> result() {
        return Observable.zip(
                repository.getResultData(),
                repository.getCountryData(),
                new BiFunction<Result, String, ViewModel>() {
                    @Override
                    public ViewModel apply(Result result, String s) throws Exception {
                        return new ViewModel(s, result.title);
                    }
                }
        );
    }
}