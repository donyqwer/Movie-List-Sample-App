package com.dtms.movielistsampleapp.http;

import com.dtms.movielistsampleapp.http.apimodel.TopRated;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {

    @GET("top_rated")
    Observable<TopRated> getTopRatedMovies(@Query("page") Integer page);

}
