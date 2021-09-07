package com.company;

public class Passenger {
    private  static int idCounter;

    private int id;
    private Contact contact;
    private Address address;

    static{
        idCounter=0;
    }

    private static class Contact{

         String name;
         String phoneNumber;
         String emailAddress;

        public Contact(String name, String phoneNumber, String emailAddress) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
        }

        public String getContactDetails(){
            return name+" , "+phoneNumber+" , "+emailAddress;
        }

        public void updateContactDetails(String name, String phoneNumber, String emailAddress){
            this.name=name;
            this.phoneNumber=phoneNumber;
            this.emailAddress=emailAddress;
        }

    }

    private static class Address{

         String street;
         String city;
         String state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getAddressDetails(){
            return street+" , "+city+" , "+state;
        }

        public void updateAddressDetails(String street, String city, String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }
    }

    public Passenger(String name, String phoneNo, String email, String street, String city, String state){
        this.id=++idCounter;
        this.contact= new Contact(name, phoneNo, email);
        this.address= new Address(street, city, state);

    }
    public int getPassengerCount(){
        return this.id;
    }

    public String getContact(){
        return "Name: "+contact.name+", Phone: "+contact.phoneNumber+", Email: "+ contact.emailAddress;
    }

    public String getAddress(){
        return "Street: "+address.street+", City: "+address.city+", State: "+address.state;
    }
}
