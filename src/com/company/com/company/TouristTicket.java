package com.company;

import java.util.Scanner;

public class TouristTicket extends Ticket {

    private String touristHotelLocation;
    private String[] selectTouristLocation= new String[5];

    int n;

    public TouristTicket(String pnrNo, Flight flight, Passenger passenger, String departureLocation, String arrivalLocation, String departureDate, String arrivalDate, String departureTime, String arrivalTime, int seatNo, float price, boolean cancelled) {
        super(pnrNo, flight, passenger, departureLocation, arrivalLocation, departureDate, arrivalDate, departureTime, arrivalTime, seatNo, price, cancelled);
        this.touristHotelLocation=touristHotelLocation;
    }

    public String getTouristHotelLocation() {
        return touristHotelLocation;
    }

    public void setTouristHotelLocation(String touristHotelLocation) {
        this.touristHotelLocation = touristHotelLocation;
    }

    public String[] getSelectTouristLocation() {
        return selectTouristLocation;
    }

    public void addTouristLocation(){

        System.out.println("Enter the no. of tourist destinations you want to add (max limit: 5)");
        Scanner scan= new Scanner(System.in);
        n=scan.nextInt();
        if(n<=5) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i<n; i++) {
                this.selectTouristLocation[i]=sc.nextLine();
            }
        }
        else{
            System.out.println("Invalid Entry");
        }
    }

    public void removeTouristLocation(String removeLocation) {
        String[] newArray= new String[selectTouristLocation.length-1];
        int index=0;
        for (int i = 0; i <n; i++) {
            if (selectTouristLocation[i].equals(removeLocation)){
                index=i;
            }
        }
        for(int i=0,j=0; i<n;i++){

                if(i==index) {
                    continue;
                }
                else {
                    newArray[j++] = selectTouristLocation[i];
                }
        }
        for(int i=0;i<n-1;i++){
//            for(int j=0;j<n-1;j++){
            System.out.println(newArray[i]);
//            }

        }
//        for(int i=0; i<n-1;i++){
//            System.out.println(selectTouristLocation[i]);
//        }
    }
}
