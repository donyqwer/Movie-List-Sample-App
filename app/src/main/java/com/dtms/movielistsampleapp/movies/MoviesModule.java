package com.dtms.movielistsampleapp.movies;

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
    public MoviesRepository provideRepository () {
        return new MemoryRepository();
    }
}
