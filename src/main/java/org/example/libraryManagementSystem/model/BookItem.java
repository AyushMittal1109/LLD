package org.example.libraryManagementSystem.model;

import org.example.libraryManagementSystem.constants.BookStatus;

import java.util.Calendar;
import java.util.Date;

public class BookItem {
    String id;
    Book book;
    boolean isReferenceOnly = false;
    // TODO what is isReferenceOnly
    Date borrowed;
    Date dueDate;
    double price;
    BookStatus status = BookStatus.AVAILABLE;
    Date dateOfPurchase;
    Date publicationDate;
    Rack placeAt;

    public BookItem(String id, Book book, Rack placeAt, double price, Date dateOfPurchase, Date publicationDate) {
        this.id = id;
        this.book = book;
        this.placeAt = placeAt;
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
        this.publicationDate = publicationDate;
    }

    public boolean checkout(String memberId) {
        if (status != BookStatus.AVAILABLE) {
            System.out.println("BookItem not available for checkout.");
            return false;
        }

        status = BookStatus.LOANED;
        borrowed = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(borrowed);
        c.add(Calendar.DATE, 15);
        dueDate = c.getTime();
        System.out.println("BookItem " + id + " checked out to member " + memberId + ", Due date : " + new java.text.SimpleDateFormat("yyyy-MM-dd").format(dueDate));
        return true;
    }

    public boolean returnBook() {
        if (status != BookStatus.LOANED) {
            System.out.println("BookItem not loaned out");
            return false;
        }
        status = BookStatus.AVAILABLE;
        System.out.println("BookItem " + id + " returned.");
        return true;
    }

    // TODO : when to use this method
    public boolean reserve() {
        if (status == BookStatus.AVAILABLE) {
            status = BookStatus.RESERVED;
            return true;
        }
        return false;
    }

    public boolean renew() {
        if (status == BookStatus.LOANED) {
            Calendar c = Calendar.getInstance();
            c.setTime(dueDate);
            c.add(Calendar.DATE, 15);
            dueDate = c.getTime();

            System.out.println("Book item renewed, id : " + id + ", new due date : " + new java.text.SimpleDateFormat("yyyy-MM-dd").format(dueDate));
            return true;
        }

        System.out.println("Cannot renew a book that's not loaned.");
        return false;
    }
}
