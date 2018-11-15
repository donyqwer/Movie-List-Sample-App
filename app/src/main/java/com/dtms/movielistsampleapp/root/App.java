package com.dtms.movielistsampleapp.root;

import android.app.Application;

import com.dtms.movielistsampleapp.movies.MoviesModule;

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .moviesModule(new MoviesModule())
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
