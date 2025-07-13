package com.devilxfiero.app.models;

import java.util.List;

public class Theatre {
  private int theatreId;
  private String address;
  private List<Screen> screens;
  private List<Show> shows;

  public Theatre(int theatreId, String address, List<Screen> screens, List<Show> shows) {  
    this.theatreId = theatreId;
    this.address = address;
    this.screens = screens;
    this.shows = shows;
  }

  public int getTheatreId() {
    return theatreId;
  }

  public void setTheatreId(int theatreId) {
    this.theatreId = theatreId;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public List<Screen> getScreens() {
    return screens;
  }

  public void setScreens(List<Screen> screens) {
    this.screens = screens;
  }

  public List<Show> getShows() {
    return shows;
  }

  public void setShows(List<Show> shows) {
    this.shows = shows;
  }

}
