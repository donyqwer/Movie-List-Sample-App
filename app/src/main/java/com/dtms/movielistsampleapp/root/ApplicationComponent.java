package com.dtms.movielistsampleapp.root;

import com.dtms.movielistsampleapp.http.ApiModuleForInfo;
import com.dtms.movielistsampleapp.http.ApiModuleForName;
import com.dtms.movielistsampleapp.movies.MoviesActivity;
import com.dtms.movielistsampleapp.movies.MoviesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, MoviesModule.class, ApiModuleForName.class, ApiModuleForInfo.class})
public interface ApplicationComponent {

    void inject(MoviesActivity target);

}
