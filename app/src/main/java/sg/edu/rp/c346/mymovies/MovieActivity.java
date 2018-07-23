package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16019829 on 23/7/2018.
 */


public class MovieActivity extends AppCompatActivity {

    TextView tvTitle;
    TextView genreyear;
    TextView Description;
    TextView Watched;
    TextView Theatre;
    ImageView ivRated;
    RatingBar rbRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        tvTitle = findViewById(R.id.textViewTitle);
        genreyear = findViewById(R.id.textViewGenre);
        Description = findViewById(R.id.textViewDescription);
        Watched = findViewById(R.id.textViewWatch);
        Theatre = findViewById(R.id.textViewTheatre);
        ivRated = findViewById(R.id.imageViewRating);
        rbRating = findViewById(R.id.ratingBar);

        Intent intentReceived = getIntent();

        ArrayList<String> myList = (ArrayList<String>) getIntent().getSerializableExtra("Mylist");
        String title = intentReceived.getStringExtra("title");
        String year = intentReceived.getStringExtra("year");
        String genre = intentReceived.getStringExtra("genre");
        String description = intentReceived.getStringExtra("description");
        String theatre = intentReceived.getStringExtra("in_theatre");
        String watched = intentReceived.getStringExtra("date");
        String rated = intentReceived.getStringExtra("rated");

        tvTitle.setText(title);
        genreyear.setText(year + " - " + genre);
        Description.setText(description);
        Watched.setText("Watch on: " + watched);
        Theatre.setText("In Theatre: " + theatre);
        int rating = intentReceived.getIntExtra("rating",0);

        rbRating.setNumStars(4);
        rbRating.setRating(rating);
        rbRating.setIsIndicator(true);

        if(rated.equals("g")){
            ivRated.setImageResource(R.drawable.rating_g);
        }
        else if(rated.equals("pg")){
            ivRated.setImageResource(R.drawable.rating_pg);
        }
        else if(rated.equals("pg13")){
            ivRated.setImageResource(R.drawable.rating_pg13);
        }
        else if(rated.equals("nc16")){
            ivRated.setImageResource(R.drawable.rating_nc16);
        }
        else if(rated.equals("m18")){
            ivRated.setImageResource(R.drawable.rating_m18);
        }
        else if(rated.equals("r21")){
            ivRated.setImageResource(R.drawable.rating_r21);
        }

    }
}
