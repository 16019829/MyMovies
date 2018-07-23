package sg.edu.rp.c346.mymovies;

import java.util.Calendar;

/**
 * Created by 16019829 on 23/7/2018.
 */

public class Movie_Item {
    private String title;
    private String year;
    private String rated;
    private String genre;
    private Calendar Watched;
    private String theatre;
    private String description;
    private Integer rating;

    public Movie_Item(String title, String year, String rated, String genre, Calendar watched_on, String in_theatre, String description, Integer rating) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        Watched = watched_on;
        this.theatre = in_theatre;
        this.description = description;
        this.rating = rating;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatched_on() {
        return Watched;
    }

    public void setWatched_on(Calendar watched_on) {
        Watched = watched_on;
    }

    public String getIn_theatre() {
        return theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }
    public String getDateString() {
        String str = Watched.get(Calendar.DAY_OF_MONTH)+"/"+Watched.get(Calendar.MONTH)+"/"+Watched.get(Calendar.YEAR);
        return str;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MovieItems{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rated='" + rated + '\'' +
                ", genre='" + genre + '\'' +
                ", Watched_on=" + Watched +
                ", in_theatre='" + theatre + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }
}
