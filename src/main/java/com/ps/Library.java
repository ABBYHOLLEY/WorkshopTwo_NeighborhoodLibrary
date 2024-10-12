package com.ps;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {

        Scanner inputLibrary = new Scanner(System.in);

        System.out.println("Please select an option below.");
        System.out.println("1. Show available books 2. Show checked out books 3. Exit");

        int userInput = inputLibrary.nextInt();

        if (userInput == 1) {

            System.out.println("Select which book to check out by book id");
            int bookChoice = inputLibrary.nextInt();
            inputLibrary.nextLine();

            System.out.println("What is your name");
            String name = inputLibrary.nextLine();

        }

        Book book1 = new Book(0);
        Book book2 = new Book(1);
        Book book3 = new Book(2);
        Book book4 = new Book(3);
        Book book5 = new Book(4);
        Book book6 = new Book(5);
        Book book7 = new Book(6);
        Book book8 = new Book(7);
        Book book9 = new Book(8);
        Book book10 = new Book(9);
        Book book11 = new Book(10);
        Book book12 = new Book(11);
        Book book13 = new Book(12);
        Book book14 = new Book(13);
        Book book15 = new Book(14);
        Book book16 = new Book(15);
        Book book17 = new Book(16);
        Book book18 = new Book(17);
        Book book19 = new Book(18);
        Book book20 = new Book(19);

        boolean isCheckedOut;
        String checkedOutTo;
        String title;
        String name;

        public void checkOut(String name) { //Loop for an array that only holds 20 books
        if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println(title = " checked out to" + name);
        } else {
            System.out.println(title + " is already checked out to" + checkedOutTo);
        }
        }
        String[] books = {
                " 1. Book1", "2. Book2", "3. Book3", "3. Book 3"
        };
        System.out.println("Select a book from library (#1-#20");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
    }
}