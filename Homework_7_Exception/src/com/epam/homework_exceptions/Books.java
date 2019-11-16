package com.epam.homework_exceptions;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Books {
    public Book[] arrayOfBooks;
    private int counter = 0;
    private int counterRes = 0;

    public Books(int size) {
        arrayOfBooks = new Book[size];
    }

   public void addBooks(Book newBook) {
        if (counter < arrayOfBooks.length) {
            arrayOfBooks[counter++] = newBook;
        }
   }

    public void printBooks() {
        if (counter == 0) {
            System.out.println("No elements");
        } else {
            for (int i = 0; i < counter; i++) {
                System.out.println(arrayOfBooks[i]);
            }
        }
    }

    public static int getSizeArray() {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.println("Books.getSizeArray: Please, enter size of array from 10 to 60");
        while (true) {
            size = sc.nextInt();
            try {
                Validator.validSize(size);
                break;
            } catch (InvalidSizeException e) {
                System.out.println(e.getMessage());
                System.out.println("Books.getSizeArray: Please, enter size from 10 to 60");
            }
        }
        return size;
    }

    public static String getSearchAuthor() {
        Scanner sc = new Scanner(System.in);
        String searchAuthor = "";
        System.out.println("Input Author for searching  --> ");
        while (true) {
            searchAuthor = sc.next();
            try {
                Validator.validAuthor(searchAuthor);
                break;
            } catch (InvalidAuthorException e) {
                System.out.println(e.getMessage());
                System.out.println("Please, enter Author for searching --> ");
            }
        }
        return searchAuthor;
    }

    public void searchAuthor() {
        String author = getSearchAuthor();
        Books res = new Books(counter);
        counterRes = 0;
        for (int i = 0; i < counter; i++) {
            if (arrayOfBooks[i].getAuthor().equalsIgnoreCase(author)) {
                res.addBooks(arrayOfBooks[i]);
                counterRes++;
            }
        }
        if (counterRes == 0) {
            System.out.println("No element with such Author");
        } else {
            System.out.println("Books with such Author:");
            res.printBooks();
        }
    }

    public static int getSearchYear() {
        Scanner sc = new Scanner(System.in);
        int searchYear = 0;
        System.out.println("Input Year for searching from 1800 to 2019 --> ");
        while (true) {
            searchYear = sc.nextInt();
            try {
                Validator.validYear(searchYear);
                break;
            } catch (InvalidYearException e) {
                System.out.println(e.getMessage());
                System.out.println("Books.getSizeArray: Please, enter Year from 1800 to 2019");
            }
        }
        return searchYear;
    }

    public void searchAfterYear() {
        int year = getSearchYear();
        Books res = new Books(counter);
        counterRes = 0;
        for (int i = 0; i < counter; i++) {
            if (arrayOfBooks[i].getYear() > year) {
                res.addBooks(arrayOfBooks[i]);
                counterRes++;
            }
        }
        if (counterRes == 0) {
            System.out.println("No books after such Year");
        } else {
            System.out.println("Books after such Year:");
            res.printBooks();
        }
    }

    public static int getPercentPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Percent for changing  --> ");
        int percent = sc.nextInt();
        return percent;
    }

    public void changePrice() {
        int percent = getPercentPrice();
        for (int i = 0; i < counter; i++) {
            arrayOfBooks[i].setPrice(Math.round(((arrayOfBooks[i].getPrice()/100 * percent + arrayOfBooks[i].getPrice() )* 100.0) / 100.0));
            }
        System.out.println("Books after changing Price");
        printBooks();
        }

    public void sortByAuthor() {
        Book[] res = Arrays.copyOf(arrayOfBooks, counter);
        Arrays.sort(res, new MyComparatorAuthor());
        System.out.println("Books after sorting by Author: ");
        printBooksRes(res);
    }

    public void sortByPublisher() {
        Book[] res = Arrays.copyOf(arrayOfBooks, counter);
        Arrays.sort(res, new MyComparatorPublisher());
        System.out.println("Books after sorting by Publisher: ");
        printBooksRes(res);
    }

    public void sortByPrice() {
        Book[] res = Arrays.copyOf(arrayOfBooks, counter);
        Arrays.sort(res, new MyComparatorPrice());
        System.out.println("Books after sorting by Price: ");
        printBooksRes(res);
    }

    public void printBooksRes(Book[] array) {
        if (counter == 0) {
            System.out.println("No elements");
        } else {
            for (int i = 0; i < counter; i++) {
                System.out.println(array[i]);
            }
        }
    }

}






