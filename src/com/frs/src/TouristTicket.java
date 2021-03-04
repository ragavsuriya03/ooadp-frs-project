package com.frs.src;
import java.time.LocalDateTime;

public class TouristTicket {
    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    String seatNo;
    float price;
    boolean cancelled;

    String hotelAddress;
    String[] selectedTouristLocation;

    TouristTicket(String pnr, String from, String to, String departureDateTime,
                  String arrivalDateTime, String seatNo, float price,
                  boolean cancelled, String hotelAddress, String[] selectedTouristLocation) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
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

    String getHotelAddress() {
        return hotelAddress;
    }

    String[] getTouristLocation() {
        return selectedTouristLocation;
    }

    void removeTouristLocation(String location) {
        int index=-1;

        for (int i=0; i<selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i].equals(location)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return;
        }

        for (int i=index; i< selectedTouristLocation.length-1; i++) {
            selectedTouristLocation[i] = selectedTouristLocation[i+1];
        }

        selectedTouristLocation[selectedTouristLocation.length-1] = null;
    }

    void addTouristLocation(String location) {
        int index = -1;

        for (int i=0; i< selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i] == null) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            selectedTouristLocation[index] = location;
        }

    }

}