package com.example.shivanikoul.recycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    //private Recy recycler;

    private RecyclerView recycler;
    private MoveiAdapter moveiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            recycler =findViewById(R.id.recycle);
            moveiAdapter =new MoveiAdapter(movieList);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            recycler.setLayoutManager(mLayoutManager);
            recycler.setItemAnimator(new DefaultItemAnimator());
            recycler.setAdapter(moveiAdapter);

            prepareMovieData();
        }

        private void prepareMovieData() {
            Movie movie = new Movie("Fanaa", "Bollywood, Romance Film, Thriller, Musical, Drama, ", "2012");
            movie.setimage(R.drawable.fanna);
            movieList.add(movie);

            movie = new Movie("Hichki", "Comedy, Drama", "2018");
            movie.setimage(R.drawable.hichki);
            movieList.add(movie);

            movie = new Movie("Queen", "Bollywood, Comedy, Adventure Film, Drama, ","2018");
            movie.setimage(R.drawable.queen);
            movieList.add(movie);

            moveiAdapter.notifyDataSetChanged();
        }

        }

