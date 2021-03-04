package com.frs.src;

public class Flight {
    String flightNumber;
    String airline;
    int capacity;
    int bookedSeats;

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }
    String getFlightDetails() {
        return "Flight No: " + flightNumber + ", Airline: " + airline + ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
    }

    boolean checkAvailability() {
        return bookedSeats < capacity;
    }

    void incrementBookingCounter() {
        bookedSeats++;
    }
}
