package com.dtms.movielistsampleapp.root;

import com.dtms.movielistsampleapp.movies.MoviesActivity;
import com.dtms.movielistsampleapp.movies.MoviesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, MoviesModule.class})
public interface ApplicationComponent {

    void inject(MoviesActivity target);

}
