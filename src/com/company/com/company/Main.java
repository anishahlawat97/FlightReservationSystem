package com.company;

public class Main {

        public static void printTicketDetails(Ticket ticket) {
            System.out.println("PNR No:" + ticket.getPnrNo());
        }



    public static void main(String[] args) {

        Passenger passenger=new Passenger("Anish", "12345", "anish@gmail.com",
                "43rd street", "bangalore", "Karnataka");
        System.out.println("Passenger No: "+passenger.getPassengerCount());
        System.out.println(passenger.getContact());
        System.out.println(passenger.getAddress());

        Flight flight=new Flight("232", "Indigo", 200, 1);
        System.out.println(flight.getFlightDetails());
        flight.updateSeats();
        System.out.println("Seat Availability: "+flight.checkAvailability());


        RegularTicket regularTicket= new RegularTicket("1234", flight, passenger, "Kochi",
                "Bangalore", "30 Sept 2020", "31 Sept 2020", "13:00",
                "11:00", 24, 5600.0f, false, "Food");
        printTicketDetails(regularTicket);
        double duration1= regularTicket.getDuration();
        System.out.println("Flight Duration: "+duration1+" hours");
        System.out.println("Flight Status: "+regularTicket.checkStatus());
        System.out.println("Special Services: "+regularTicket.getSpecialServices());


        TouristTicket touristTicket= new TouristTicket("128", flight, passenger, "Kochi",
                "bangalore", "30 Sept 2020", "31 Sept 2020", "13:45",
                "11:00", 24, 5600.0f, false);
        printTicketDetails(touristTicket);
        double duration2=touristTicket.getDuration();
        System.out.println("Flight Duration: "+duration2+" hours");
        System.out.println("Flight Status: "+touristTicket.checkStatus());
        touristTicket.addTouristLocation();
        touristTicket.removeTouristLocation("Delhi");

    }
}
