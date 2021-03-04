package com.frs.src;
import java.time.LocalDateTime;

public class RegularTicket {

    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    String seatNo;
    float price;
    boolean cancelled;

    String specialServices;

    RegularTicket(String pnr, String from, String to, String departureDateTime,String arrivalDateTime,
                  String seatNo, float price, boolean cancelled,
                  Flight flight, Passenger passenger, String specialServices) {

            this.pnr=pnr;
            this.from=from;
            this.to=to;
            this.departureDateTime=departureDateTime;
            this.arrivalDateTime=arrivalDateTime;
            this.seatNo=seatNo;
            this.price=price;
            this.cancelled=cancelled;
            this.specialServices = specialServices;
    }

    String checkStatus() {
        return cancelled ? "Cancelled" : "Confirmed";
    }

    int getFlightDuration() {
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 + (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }

    void cancel() {
        cancelled = true;
    }

    String getSpecialServices() {
        return specialServices;
    }

    void updateSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

}