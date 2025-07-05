
package com.devilxfiero.app.models;

import com.devilxfiero.app.enums.SeatCategory;

public class Seat {
  private String seatId;
  private SeatCategory category;
  private double price;

  public Seat(String seatId, SeatCategory category) {
    this.seatId = seatId;
    this.category = category;
    if (this.category.equals(SeatCategory.SILVER)) {
      this.price = 10.0;
    } else if (this.category.equals(SeatCategory.GOLD)) {
      this.price = 20.0;
    } else if (this.category.equals(SeatCategory.PLATINUM)) {
      this.price = 30.0;
    }
  }

  public String getSeatId() {
    return seatId;
  }

  public void setSeatId(String seatId) {
    this.seatId = seatId;
  }

  public SeatCategory getCategory() {
    return category;
  }

  public void setCategory(SeatCategory category) {
    this.category = category;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

}
