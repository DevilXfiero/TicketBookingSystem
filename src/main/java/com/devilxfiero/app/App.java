package com.devilxfiero.app;

import com.devilxfiero.app.models.Screen;
import com.devilxfiero.app.models.Seat;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;


/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    List<Seat> seats = new ArrayList<>();
    seats.add(new Seat("A1", SeatCategory.SILVER));
    seats.add(new Seat("A2", SeatCategory.GOLD));
    seats.add(new Seat("A3", SeatCategory.PLATINUM));

    Screen screen1 = new Screen(seats);
    Screen screen2 = new Screen(seats);

  }
}
