package com.dtms.movielistsampleapp.movies;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import com.dtms.movielistsampleapp.R;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.ListItemViewHolder> {

    private List<ViewModel> list;

    public MovieListAdapter(List<ViewModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ListItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_movie, viewGroup, false);
        return new ListItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ListItemViewHolder listItemViewHolder, int i) {
        listItemViewHolder.movieName.setText(list.get(i).getName());
        listItemViewHolder.countryName.setText(list.get(i).getCountry());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ListItemViewHolder extends RecyclerView.ViewHolder {

        public TextView movieName;
        public TextView countryName;

        public ListItemViewHolder(View itemView) {
            super(itemView);
            movieName = itemView.findViewById(R.id.tv_movie_name);
            countryName = itemView.findViewById(R.id.tv_country_name);
        }
    }
}
