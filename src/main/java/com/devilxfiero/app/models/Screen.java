package com.devilxfiero.app.models;

import java.util.UUID;
import java.util.List;

public class Screen {
  private int screenId;
  List<Seat> seats;

  public Screen(List<Seat> seats) {
    this.screenId = UUID.randomUUID().hashCode();
    this.seats = seats;
  }

  public int getScreenId() {
    return screenId;
  }

  public void setScreenId(int screenId) {
    this.screenId = screenId;
  }

  public List<Seat> getSeats() {
    return seats;
  }

  public void setSeats(List<Seat> seats) {
    this.seats = seats;
  }

}
