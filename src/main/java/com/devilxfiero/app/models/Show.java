package com.devilxfiero.app.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Show {
  private int showId;
  private String showTime; // e.g., "2023-10-01T20:00:00"
  private Movie movie;
  private Screen screen;
  private Set<Seat> bookedSeats;

  public Show(String showTime, Movie movie, Screen screen) {
    this.showId = (int) (Math.random() * 10000);
    this.showTime = showTime;
    this.movie = movie;
    this.screen = screen;
    this.bookedSeats = new HashSet<>();
  }

  public synchronized Booking bookTicket(List<String> seatIds) {

    List<Seat> availableSeats = screen.getSeats();
    List<Seat> confirmedSeats = new ArrayList<>();
    for(String seatId : seatIds) {
        Seat seat = availableSeats.stream()
            .filter(s -> s.getSeatId().equals(seatId))
            .findFirst()
            .orElse(null);
       if(seat == null || bookedSeats.contains(seat)) {
            throw new IllegalArgumentException("Seat " + seat + " is not available.");}
      confirmedSeats.add(seat);
    }
    
    bookedSeats.addAll(confirmedSeats);
    Booking booking = new Booking(this, confirmedSeats);

    return booking;
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
