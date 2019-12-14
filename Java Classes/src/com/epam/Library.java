package com.epam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    private String nameLibrary;
    private final List<Book> books;

    public Library(String nameLibrary, List<Book> books) {
        this.nameLibrary = nameLibrary;
        this.books = books;
    }

    public List<Book> listOfBooksByAuthor() {
        List<Book> booksByAuthor = new ArrayList<>();
        Comparator<Book> comparator = new Comparator<Book>() { //анонимный класс
            @Override
            public int compare(Book book, Book t1) {
                return book.getAuthor().compareTo(t1.getAuthor());
            }
        };
        Collections.sort(books, comparator);

        return booksByAuthor;
    }

    public List<Book> listOfBooksByPublisher() {
        List<Book> booksByPublisher = new ArrayList<>();
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book book, Book t1) {
                return book.getPublisher().compareTo(t1.getPublisher());
            }
        };
        Collections.sort(books, comparator);

        return booksByPublisher;
    }

    public List<Book> listOfBooksByYear() {
        List<Book> booksByYear = new ArrayList<>();
        for (Book elementOfBook : books) {
            if (elementOfBook.getYearOfPublicashion() > 2017) {
                booksByYear.add(elementOfBook);
            }
        }
        System.out.println("Books after 2017 : " + booksByYear);
        return booksByYear;
    }
}
