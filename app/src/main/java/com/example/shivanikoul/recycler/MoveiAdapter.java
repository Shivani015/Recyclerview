package com.example.shivanikoul.recycler;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;



public class MoveiAdapter extends RecyclerView.Adapter<MoveiAdapter.ViewHolder> {




    private List<Movie> movieList;

    public MoveiAdapter(List<Movie> movieList) { this.movieList = movieList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View View = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new ViewHolder(View);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Movie movie = movieList.get(position);

        holder.title.setText(movie.getTitle());
        holder.title.setText(movie.getGenre());
        holder.title.setText(movie.getYear());
        holder.image.setImageResource(movie.getimage());

    }


    @Override
    public int getItemCount() {
        return movieList.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;
        public ImageView image;


        public ViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
            image =view.findViewById(R.id.image);
        }
    }

}

