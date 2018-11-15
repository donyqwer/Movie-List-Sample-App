package com.dtms.movielistsampleapp.movies;

import java.util.ArrayList;
import java.util.List;

public interface MoviesActivityMVP {
    interface View {

        void showData(List<ViewModel> dummyData);

        void showSnackbar(String s);

    }

    interface Presenter {

        void loadData();

        void setView(MoviesActivityMVP.View view);

    }

    interface Model {
        List<ViewModel> getDummyData();
    }
}
