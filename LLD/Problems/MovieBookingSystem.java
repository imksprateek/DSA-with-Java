package LLD.Problems;

import java.util.*;

enum BookingStatus {
    PENDING,
    CONFIRMED,
    CANCELLED
}

enum SeatType {
    REGULAR,
    PREMIUM
}

class Address{
    String street, city, state, zip;
    Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}

class Account{
    String id, password;
    Account(String id, String password) {
        this.id = id;
        this.password = password;
    }
}

class Show{
    String id;
    List<SeatShow> seats;
    Show(String id) {
        this.id = id;
        this.seats = new ArrayList<>();
    }
}

class SeatShow{
    int seatId;
    boolean reserved;
    // boolean tempReserved;
// LLD.BookingStatus status;
    SeatType type;
    double price;
    SeatShow(int seatId, boolean reserved, SeatType type, double price) {
        this.seatId = seatId;
        this.reserved = reserved;
        this.type = type;
        this.price = price;
    }
}
class Movie{
    String title;
    List<Show> shows;
    Movie(String title) {
        this.title = title;
        this.shows = new ArrayList<>();
    }
    void addShow(Show show) {
        this.shows.add(show);
    }
}

class Booking{
    UUID uuid = UUID.randomUUID();
    BookingStatus status;
    List<SeatShow> seats;
    Show show;
    Booking(BookingStatus status, List<SeatShow> seats, Show show) {
        this.status = status;
        this.seats = seats;
        this.show = show;
    }
}



class MovieBookingSystem{
    public static void main(String[] args) {
        Movie movie = new Movie("Inception");

        Show show1 = new Show("Show1");
        show1.seats.add(new SeatShow(1, false, SeatType.REGULAR, 10.0));
        show1.seats.add(new SeatShow(2, false, SeatType.PREMIUM, 20.0));

        Show show2 = new Show("Show2");
        show2.seats.add(new SeatShow(3, false, SeatType.REGULAR, 10.0));
        show2.seats.add(new SeatShow(4, false, SeatType.PREMIUM, 20.0));

        movie.addShow(show1);
        movie.addShow(show2);

        List<SeatShow> bookedSeats = new ArrayList<>();
        bookedSeats.add(show1.seats.get(1));
        Booking booking = new Booking(BookingStatus.CONFIRMED, bookedSeats, show1);

        System.out.println("LLD.Booking ID: " + booking.uuid);
        System.out.println("LLD.Booking Status: " + booking.status);
    }
}