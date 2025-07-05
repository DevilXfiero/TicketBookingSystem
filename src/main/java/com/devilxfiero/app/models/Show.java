package com.devilxfiero.app.models;

public class Show {
  private int showId;
  private String showTime; // e.g., "2023-10-01T20:00:00"
  private Movie movie;
  private Screen screen;

  public Show(String showTime, Movie movie, Screen screen) {
    this.showId = (int) (Math.random() * 10000);
    this.showTime = showTime;
    this.movie = movie;
    this.screen = screen;
  }

  public int getShowId() {
    return showId;
  }

  public void setShowId(int showId) {
    this.showId = showId;
  }

  public String getShowTime() {
    return showTime;
  }

  public void setShowTime(String showTime) {
    this.showTime = showTime;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  public Screen getScreen() {
    return screen;
  }

  public void setScreen(Screen screen) {
    this.screen = screen;
  }
}
