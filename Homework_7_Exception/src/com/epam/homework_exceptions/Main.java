package com.epam.homework_exceptions;

public class Main {

    public static void main(String[] args) throws Exception {

            Books shelf = new Books(Books.getSizeArray());
            shelf.addBooks(new Book (1, "Book1", "Author1", "Publisher1", 2018, 250, 115.35));
            shelf.addBooks(new Book (2, "Book2", "Author2", "Publisher2", 2017, 100, 210.80));
            shelf.addBooks(new Book (3, "Book3", "Author1", "Publisher3", 2005, 756, 108.75));
            shelf.addBooks(new Book (4, "Book4", "Author3", "Publisher3", 2019, 328, 65.40));
            shelf.addBooks(new Book (5, "Book5", "Author3", "Publisher2", 2001, 105, 112.00));
            shelf.addBooks(new Book (6, "Book6", "Author4", "Publisher4", 2018, 470, 107.80));
            shelf.addBooks(new Book (7, "Book7", "Author1", "Publisher5", 2007, 108, 96.55));
            shelf.addBooks(new Book (8, "Book8", "Author2", "Publisher1", 2007, 236, 115.35));
            shelf.addBooks(new Book (9, "Book9", "Author5", "Publisher3", 2010, 112, 104.60));
            shelf.addBooks(new Book (10, "Book10", "Author4", "Publisher6", 1995, 147, 95.99));

            shelf.printBooks();
            shelf.searchAuthor();
            shelf.searchAfterYear();
            shelf.changePrice();
            shelf.sortByAuthor();
            shelf.sortByPublisher();
            shelf.sortByPrice();
        }



}
