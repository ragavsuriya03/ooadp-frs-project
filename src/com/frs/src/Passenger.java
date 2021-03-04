package com.frs.src;

public class Passenger {

    private int id;
    private static int idCounter=0;

    private Address address;
    private Contact contact;

    private static class Address {
        String street, city, state;

        Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private static class Contact {
        String name, phone, email;

        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    public Passenger(String street, String city, String state, String name, String phone, String email) {
        this.id = ++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
    }

    //using getters

    public int getId() {
        return this.id;
    }

    public String getAddress() {
        return "Street: " + address.street + ", City: " + address.city + ", State: " + address.state;
    }
    public String getContactDetails() {
        return "Name: " + contact.name + ", Phone: " + contact.phone + ", Email: " + contact.email;
    }

    public static int getPassengerCount() {
        return idCounter;
    }

    }
