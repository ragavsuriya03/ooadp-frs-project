package com.frs.src;

public class Main {

    public static void main(String[] args) {

        Ticket regularTicket = new RegularTicket("321651", "Coimbatore",
                "Bengaluru", "DepartureDateTime", "ArrivalDateTime",
                "36B", 3500, false, null, null, "Breakfast");

        Ticket touristTicket = new TouristTicket("5421", "India", "Germany",
                "DepartureDateTime", "ArrivalDateTIme",
                "21C", 50000, false, null, null,
                "Expedia Hotel", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}