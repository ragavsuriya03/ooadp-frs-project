package com.frs.src;
import java.time.LocalDateTime;

public class TouristTicket {
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;
    private String hotelAddress;
    private String[] selectedTouristLocation;
    private Flight flight;
    private Passenger passenger;

    public TouristTicket(String pnr, String from, String to, String departureDateTime,
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

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

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

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getTouristLocation() {
        return selectedTouristLocation;
    }

    public void removeTouristLocation(String location) {
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

    public void addTouristLocation(String location) {
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