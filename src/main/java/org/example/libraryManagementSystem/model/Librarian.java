package org.example.libraryManagementSystem.model;

import javax.xml.catalog.Catalog;

public class Librarian extends User{
    public Librarian(String id, String password, LibraryCard card, Person person) {
        super(id, password, card, person);
    }

    public boolean addBookItem(Catalog catalog, BookItem bookItem)
}
