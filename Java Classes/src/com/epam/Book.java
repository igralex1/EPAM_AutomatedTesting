/**
 * 5. Book: id, Название, Автор (ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.
 *
 *         Создать массив объектов. Вывести:
 *
 *         a) список книг заданного автора;
 *
 *         b)   список книг, выпущенных заданным издательством;
 *
 *         c)   список книг, выпущенных после заданного года.
 */

package com.epam;

import java.util.Random;


public class Book {
    Random randomId = new Random(100);
    private int id = randomId.nextInt();
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublicashion;
    private int numberOfPages;
    private double price;
    private String typeOfBinding;

    // Constructor
    Book() {
        System.out.println("New book created");
    }

    Book(String title, String author, String publisher, int year, int pages, double price, String binding) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublicashion = year;
        this.numberOfPages = pages;
        this.price = price;
        this.typeOfBinding = binding;
    }

    @Override
    public void toString() {
        System.out.println(
                "Название: " + this.title +
                "Автор:" + this.author +
                "Издательство:" + this.publisher +
                "Год издательства:" + this.yearOfPublicashion +
                "Количество страниц:" + this.numberOfPages +
                "Цена:" + this.price +
                "Тип переплета:" + this.typeOfBinding);
    }

    // Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublicashion() {
        return yearOfPublicashion;
    }

    public void setYearOfPublicashion(int yearOfPublicashion) {
        this.yearOfPublicashion = yearOfPublicashion;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }


}
