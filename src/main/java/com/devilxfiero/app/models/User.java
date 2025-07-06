package com.devilxfiero.app.models;

import java.util.List;
import java.util.UUID;

public class User {

  private String username;
  private String password;
  private String email;

  public User(String username, String email) {
    this.username = username;
    this.email = email;
    this.password = UUID.randomUUID().toString();

  }

  public Booking bookShow(Show show, List<String> seatIds) {
    return show.bookTicket(seatIds);
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
