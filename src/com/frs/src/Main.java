package com.frs.src;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Passenger passenger=new Passenger();
        Address address=new Address("Extension street","  Avinashi","  Tamilnadu");
        Contact contact=new Contact();

        Flight flight=new Flight("10","Air Deccan",150,39);

        Ticket ticket=new Ticket();

        RegularTicket regularTicket=new RegularTicket("321651", "Coimbatore",
                "Bengaluru", "departure at  8:00", "arrive at 10:00",
                "36B", 3500, true, null, null, "Breakfast");

        TouristTicket touristTicket=new TouristTicket("5421"," Coimbatore"," Germany"," departure at 9:30","  arrival at 7:30",
                "  21C  ",50000,false," Berlin ",null);

        System.out.println(contact.name+" "+contact.email+" "+contact.phone);
        System.out.println();

        System.out.println(passenger.address);
        System.out.println();

        System.out.println("Address: "+address.street+address.city+address.state);
        System.out.println();

        System.out.println(ticket.cancelled);
        System.out.println();

        System.out.println("Flight detail: "+flight.flightNumber+" "+flight.airline+" "+flight.bookedSeats+" "+flight.capacity);
        System.out.println();

        System.out.println("regular ticket Details: "+regularTicket.pnr+" "+regularTicket.from+" "+regularTicket.to+
                " "+regularTicket.departureDateTime+" "+regularTicket.arrivalDateTime+" "+ regularTicket.seatNo+" "+
                regularTicket.price+" "+regularTicket.cancelled+" "+regularTicket.specialServices);
        System.out.println();


        System.out.println("Tourist Ticket details: "+touristTicket.pnr+" "+touristTicket.from+" "+touristTicket.to+
                " "+touristTicket.departureDateTime+" "+touristTicket.arrivalDateTime+" "+touristTicket.seatNo+" "+
                touristTicket.price+" "+touristTicket.cancelled+" "+touristTicket.selectedTouristLocation);
        System.out.println();
    }
}
