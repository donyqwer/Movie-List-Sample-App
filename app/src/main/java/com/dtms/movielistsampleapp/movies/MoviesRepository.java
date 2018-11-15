package com.dtms.movielistsampleapp.movies;

import com.dtms.movielistsampleapp.http.apimodel.Result;

import io.reactivex.Observable;

public interface MoviesRepository {

    Observable<Result> getResultsFromMemory();

    Observable<Result> getResultsFromNetwork();

    Observable<String> getCountriesFromMemory();

    Observable<String> getCountriesFromNetwork();

    Observable<String> getCountryData();

    Observable<Result> getResultData();

}
