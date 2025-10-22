package org.example.libraryManagementSystem.model;

public class Library {

    //making singleton class
    private static Library instance = null;
    String name;
    Address address;
    Catalog catalog;
    private Library(String name, Address address) {
        this.name = name;
        this.address = address;
        this.catalog = new Catalog();
    }

    public static Library getInstance(String name, Address address) {
        if (instance == null) instance = new Library(name, address);
        return instance;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
