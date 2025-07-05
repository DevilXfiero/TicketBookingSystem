package com.devilxfiero.app.models;

public class Movie {
  private String title;
  private String genre;
  private int duration; // in minutes
  private String director;

  public Movie(String title, String genre, int duration, String director) {
    this.title = title;
    this.genre = genre;
    this.duration = duration;
    this.director = director;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }
}
