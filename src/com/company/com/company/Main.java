package com.company;

public class Main {

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnrNo());
    }

    public static void main(String[] args) {
        Passenger passenger=new Passenger("Anish", "12345", "anish@gmail.com", "2nd street", "bangalore", "Karnataka");
        System.out.println(passenger.getAddress());
        System.out.println(passenger.getContact());

        Flight flight=new Flight("232", "Indigo", 20, 21);
        System.out.println(flight.getFlightDetails());
        flight.updateSeats();
        System.out.println(flight.checkAvailability());

        Flight flight1=new Flight("123", "Indigo", 20, 15);
        flight.updateSeats();

        RegularTicket regularTicket= new RegularTicket("1234", flight, passenger, "Kochi", "bangalore", "30 Sept 2020", "31 Sept 2020", "13:00", "11:00", 24, 5600.0f, false, "Food");
        double a= regularTicket.getDuration();

        System.out.println(a+" hours");

        TouristTicket touristTicket= new TouristTicket("128", flight, passenger, "Kochi", "bangalore", "30 Sept 2020", "31 Sept 2020", "13:45  ", "11:00", 24, 5600.0f, false);
        double b=touristTicket.getDuration();
        System.out.println(b+" hours");
        touristTicket.addTouristLocation();
        touristTicket.removeTouristLocation("Delhi");
    }
}
