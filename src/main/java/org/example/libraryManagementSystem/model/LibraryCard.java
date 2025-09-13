package org.example.libraryManagementSystem.model;

import java.util.Date;

public class LibraryCard {
    private String cardNumber;
    private Date issued;
    private boolean active = true;

    public LibraryCard(String cardNumber, Date issued, boolean active) {
        this.cardNumber = cardNumber;
        this.issued = issued;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }
}
