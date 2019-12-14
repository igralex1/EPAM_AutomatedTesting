

package com.epam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("В метре друг от друга", "Микки Дотри", " Эксмо", 2019, 368, 12.13, "Твердый переплет");
        Book book2 = new Book("Атлант расправил плечи", "Айн Рэнд", "  Альпина Паблишер", 2019, 1408, 28.31, "Твердый переплет");
        Book book3 = new Book("1984", "Джордж Оруэл", "АСТ", 2015, 320, 8.12, "Твердый переплет");

        List<Book> books = new ArrayList<Book>() {
        };
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Library library = new Library("Minsk Library", books);

        System.out.println("Before sorting list of books" + books);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //список книг заданного автора
        library.listOfBooksByAuthor();
        System.out.println(books);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // список книг, выпущенных заданным издательством
        library.listOfBooksByPublisher();
        System.out.println(books);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //список книг, выпущенных после заданного года
        library.listOfBooksByYear();

    }
}