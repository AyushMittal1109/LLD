package org.example.libraryManagementSystem.model;

import org.example.libraryManagementSystem.constants.AccountStatus;

public abstract class User {
    private String id;
    private String password;
    private AccountStatus status;
    private LibraryCard card;
    private Person person;

    public User(String id, String password, LibraryCard card, Person person) {
        this.id = id;
        this.password = password;
        this.card = card;
        this.person = person;
        this.status = AccountStatus.ACTIVE;
    }

    public boolean resetPassword() {
        System.out.println("Reset password for user : " + id);
        return true;
    }
}
