package com.nhnacademy.app;

import java.util.Set;

public class Movie {
    private final long movieId;
    private final String title;
    private final Set<String> genres;


    public String getTitle() {
        return title;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public Movie(long movieId, String title, Set<String> genres){
        this.movieId = movieId;
        this.title = title;
        this.genres = genres;
    }

    public long getMovieId(){
        return movieId;
    }

    // public static CSVParser parse(String string, CSVFormat format) throws IOException


}