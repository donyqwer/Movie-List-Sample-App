package com.dtms.movielistsampleapp.movies;

import com.dtms.movielistsampleapp.http.MoreInfoApiService;
import com.dtms.movielistsampleapp.http.MovieApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MoviesModule {

    @Provides
    public MoviesActivityMVP.Presenter provideMoviePresneter(MoviesActivityMVP.Model moviesModel){
        return new MoviesActivityPresenter(moviesModel);
    }

    @Provides
    public MoviesActivityMVP.Model provideMovieModel(MoviesRepository repository){
        return new MoviesActivityModel(repository);
    }

    @Singleton
    @Provides
    public MoviesRepository provideRepository (MovieApiService movieApiService, MoreInfoApiService moreInfoApiService) {
        return new MemoryRepository(movieApiService, moreInfoApiService);
    }
}
