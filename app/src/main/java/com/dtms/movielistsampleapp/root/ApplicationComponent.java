package com.dtms.movielistsampleapp.root;

import com.dtms.movielistsampleapp.movies.MoviesActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(MoviesActivity target);

}
