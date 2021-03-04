package com.frs.src;

public class Passenger {
    int id;
    Address address;
    Contact contact;

    //using getters
    public String getAddress() {
        return "Street: " + address.street + ", City: " + address.city + ", State: " + address.state;
    }
    public String getContact() {
        return "Name: " + contact.name + ", Phone: " + contact.phone + ", Email: " + contact.email;
    }
}
