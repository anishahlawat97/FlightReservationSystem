package com.company;

public class Flight {

    private String flightNo;
    private String airline;
    private int capacity;
    private int seatsBooked;

    public Flight(String flightNo, String airline, int capacity, int seatsBooked){
        this.flightNo=flightNo;
        this.airline=airline;
        this.capacity=capacity;
        this.seatsBooked=seatsBooked;
    }

    public String getFlightDetails() {
        return "Flight No.: "+flightNo+" , Airlines: "+airline;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean checkAvailability(){
        if(seatsBooked<capacity){
            return true;
        }
        else{
            return false;
        }
    }

    public void updateSeats(){
        if(checkAvailability()){
            seatsBooked+=1;
        }
    }
}
