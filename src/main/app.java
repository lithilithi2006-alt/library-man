package com.library;

import java.util.*;

class User {
    String name;
    int id;

    User(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String name = sc.nextLine();

        System.out.print("Enter User ID: ");
        int id = sc.nextInt();

        User user = new User(name, id);

        System.out.print("Enter number of books issued: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Book> books = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title: ");
            String title = sc.nextLine();
            books.add(new Book(title));
        }

        System.out.print("Enter number of days borrowed: ");
        int days = sc.nextInt();

        int allowedDays = 7;
        int fine = 0;

        if (days > allowedDays) {
            fine = (days - allowedDays) * 10;
        }

        System.out.println("\n--- Library Details ---");
        System.out.println("Name: " + user.name);
        System.out.println("ID: " + user.id);

        System.out.println("Books Issued:");
        for (Book b : books) {
            System.out.println("- " + b.title);
        }

        System.out.println("Total Fine: Rs. " + fine);
    }
}