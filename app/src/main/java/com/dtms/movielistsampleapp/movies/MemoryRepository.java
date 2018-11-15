package com.dtms.movielistsampleapp.movies;

import java.util.ArrayList;
import java.util.List;

public class MemoryRepository implements MoviesRepository {
    private List<ViewModel> dummyData = new ArrayList<>();

    @Override
    public List<ViewModel> getDummyData() {
        dummyData.add(new ViewModel("INA", "A Some Movie"));
        dummyData.add(new ViewModel("USA", "Nightmare Movie"));
        dummyData.add(new ViewModel("UK", "History Movie"));
        return dummyData;
    }
}
