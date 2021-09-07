package com.company;

public abstract class Ticket {
    private static int idCounter;

    private int id;
    private String pnrNo;
    private String departureLocation;
    private String arrivalLocation;
    private String departureDate;
    private String arrivalDate;
    private String departureTime;
    private String arrivalTime;
    private Passenger passenger;
    private Flight flight;
    private int seatNo;
    private float price;
    private boolean cancelled;

    static {
        idCounter = 0;
    }

    public Ticket(String pnrNo, Flight flight, Passenger passenger, String departureLocation, String arrivalLocation, String departureDate, String arrivalDate, String departureTime, String arrivalTime, int seatNo, float price, boolean cancelled) {
        this.id = ++idCounter;
        this.pnrNo = pnrNo;
        this.flight = flight;
        this.passenger = passenger;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }

    public String getPnrNo() {
        return pnrNo;
    }

    public void setPnrNo(String pnrNo) {
        this.pnrNo = pnrNo;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public double getDuration() {
        double hours = 0;
        double minutes = 0;
        String[] arrTime = arrivalTime.split(":");
        int arrivalHours = Integer.parseInt(arrTime[0]);
        int arrivalMinutes = Integer.parseInt(arrTime[1]);
        String[] depTime = departureTime.split(":");
        int departureHours = Integer.parseInt(depTime[0]);
        int departureMinutes = Integer.parseInt(depTime[1]);
        if (departureDate.equals(arrivalDate)) {
            if (departureHours > arrivalHours) {
                hours = departureHours - arrivalHours;
                if (departureMinutes >= arrivalMinutes) {
                    minutes = departureMinutes - arrivalMinutes;
                } else {
                    minutes = arrivalMinutes - departureMinutes;
                }
                minutes = minutes / 60;
            } else {
                hours = arrivalHours - departureHours;
            }
            return hours + minutes;
        } else {
            if (departureHours > arrivalHours) {
                hours = arrivalHours + (24 - departureHours);
                if (departureMinutes > departureMinutes) {
                    minutes = departureMinutes - arrivalMinutes;
                } else {
                    minutes = arrivalMinutes - departureMinutes;
                }
                minutes = minutes / 60;
            } else {
                hours = arrivalHours - departureHours;
            }
            return hours + minutes;
        }
    }

    public void cancel(){
        cancelled=false;
        System.out.println("Ticket has been cancelled");
    }

    public String checkStatus(){
        if(cancelled==true){
            return "Cancelled";
        }
        else{
            return "Confirmed";
        }
    }
}

