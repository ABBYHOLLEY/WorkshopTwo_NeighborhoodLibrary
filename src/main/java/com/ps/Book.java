package com.ps;

import java.util.Scanner;

public class Book {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    // Attributes
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;
    private String checkOut;


    // Constructor
public Book(int id, String isbn, String title){
    this.id = id;
    this.isbn = isbn;
    this.title = title;
    this.isCheckedOut = false; // Book is not checkout out yet
    this.checkedOutTo = ""; // No one has checked book out yet
    }

    public void checkOut(String name){ //Loop for an array that only holds 20 books
    if (!isCheckedOut){
        isCheckedOut = true;
        checkedOutTo = name;
        System.out.println(title = " checked out to" + name);
    } else{
        System.out.println(title + " is already checked out to" + checkedOutTo);
        }
    }

    static Book[] inventory = new Book [20]; // An array that holds 25 books

    public Book(int id) {
        this.id = id;
    }
    public Book(String isbn) {
        this.isbn = isbn;
    }


}
