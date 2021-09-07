package com.company;

public class RegularTicket extends Ticket {

    private String specialServices;


    public RegularTicket(String pnrNo, Flight flight, Passenger passenger, String departureLocation, String arrivalLocation, String departureDate, String arrivalDate, String departureTime, String arrivalTime, int seatNo, float price, boolean cancelled, String specialServices) {
        super(pnrNo, flight, passenger, departureLocation, arrivalLocation, departureDate, arrivalDate, departureTime, arrivalTime, seatNo, price, cancelled);
        this.specialServices=specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
