package org.example.libraryManagementSystem.model;

import org.example.libraryManagementSystem.constants.BookFormat;

import java.util.Date;
import java.util.List;

public class Book {
    private String isbn, title, subject, publisher, language;
    private Date publicationDate;
    private int numberOfPages;
    private BookFormat format;
    private List<Author> authors;

    public Book(String isbn, String title, String subject, String publisher,
                String language, Date publicationDate, int numberOfPages, BookFormat format,
                List<Author> authors) {
        this.isbn = isbn;
        this.title = title;
        this.subject = subject;
        this.publisher = publisher;
        this.language = language;
        this.publicationDate = publicationDate;
        this.numberOfPages = numberOfPages;
        this.format = format;
        this.authors = authors;
    }
}
