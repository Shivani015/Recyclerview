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
            Movie movie = new Movie("3 Idiots", "Comedy & Drama", "2009");
            movie.setimage(R.drawable.idiot);
            movieList.add(movie);

            movie = new Movie("Harry Potter", "Fiction, Adventure Film, Family film", "2002");
            movie.setimage(R.drawable.harrypotter);
            movieList.add(movie);

            movie = new Movie("Krrish", "Action & Adventure", "2006");
            movie.setimage(R.drawable.krrish);
            movieList.add(movie);

            moveiAdapter.notifyDataSetChanged();
        }

        }

