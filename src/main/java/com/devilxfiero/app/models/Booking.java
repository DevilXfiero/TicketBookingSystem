package com.devilxfiero.app.models;

import java.util.List;
import java.util.UUID;

public class Booking {
  private String boookingId;
  private Show show;
  private List<Seat> seats;
  private double totalPrice;

  public Booking(Show show, List<Seat> seats) {
    this.boookingId = UUID.randomUUID().toString();
    this.show = show;
    this.seats = seats;
    this.totalPrice = calculateTotalPrice();
  }

  public String getBoookingId() {
    return boookingId;
  }

  public void setBoookingId(String boookingId) {
    this.boookingId = boookingId;
  }

  public Show getShow() {
    return show;
  }

  public void setShow(Show show) {
    this.show = show;
  }

  public List<Seat> getSeats() {
    return seats;
  }

  public void setSeats(List<Seat> seats) {
    this.seats = seats;
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(double totalPrice) {
    this.totalPrice = totalPrice;
  }

  private double calculateTotalPrice() {
    double total = 0.0;
    for (Seat seat : seats) {
      total += seat.getPrice();
    }
    return total;
  }
}
