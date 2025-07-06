package com.devilxfiero.app;

import java.util.ArrayList;
import java.util.List;

import com.devilxfiero.app.enums.SeatCategory;
import com.devilxfiero.app.models.Booking;
import com.devilxfiero.app.models.Movie;
import com.devilxfiero.app.models.Screen;
import com.devilxfiero.app.models.Seat;
import com.devilxfiero.app.models.Show;
import com.devilxfiero.app.models.Theatre;
import com.devilxfiero.app.models.User;

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
    

    Movie movie = new Movie("Inception", "Sci-Fi", 148, "Christopher Nolan");
    Movie movie2 = new Movie("The Matrix", "Sci-Fi", 136, "Lana Wachowski, Lilly Wachowski");


    Show show1 = new Show("2023-10-01T20:00:00", movie, screen1);
    Show show2 = new Show("2023-10-01T22:00:00", movie2, screen2);
    

    Theatre theatre = new Theatre(1, "123 Movie St, Film City", List.of(screen1, screen2), List.of(show1, show2));
    Theatre theatre2 = new Theatre(2, "456 Cinema Ave, Movie Town", List.of(screen1, screen2), List.of(show1, show2));

    User user = new User("DevilXfiero","devilxfiero@gmail.com");
    Booking booking = user.bookShow(show1, List.of("A1"));
    System.out.println("Booking successfull with booking id " + booking.getBoookingId());

  }

}
