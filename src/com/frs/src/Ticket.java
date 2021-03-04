package com.frs.src;
import java.time.LocalDateTime;

public class Ticket {
    String pnr;
    String from;
    String to;

    Flight flight;

    String departureDateTime;
    String arrivalDateTime;

    Passenger passenger;

    String seatNo;
    float price;
    boolean cancelled;

    public String checkStatus() {
        return cancelled ? "Cancelled" : "Confirmed";
    }

    public int getFlightDuration() {
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 + (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }

    public void cancel() {
        cancelled = true;
    }
}
