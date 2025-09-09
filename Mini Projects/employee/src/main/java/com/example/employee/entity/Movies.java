package com.example.employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name="movies_table")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int id;

    @Column
    private String movieName;

    @Column
    private String duration;

    @Column
    private double imdb_rate;

    @Column
    private String lang;

    public Movies() {
    }

    public Movies(String movieName, String duration, double imdb_rate, String lang) {
        this.movieName = movieName;
        this.duration = duration;
        this.imdb_rate = imdb_rate;
        this.lang = lang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getImdb_rate() {
        return imdb_rate;
    }

    public void setImdb_rate(double imdb_rate) {
        this.imdb_rate = imdb_rate;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movieName='" + movieName + '\'' +
                ", duration='" + duration + '\'' +
                ", imdb_rate=" + imdb_rate +
                ", lang='" + lang + '\'' +
                '}';
    }
}
