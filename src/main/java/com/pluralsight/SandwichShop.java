package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        // Import Scanner
        Scanner subway = new Scanner(System.in);

        // ask user which size sandwich they want
        System.out.print("Enter sandwich size (1-Regular, 2-Large): ");
        int size = subway.nextInt();

        // Variable to store sandwich price
        double price;

        // Price determined
        if (size == 1) {
            price = 5.45;
        } else {
            price = 8.95;
        }

        // Ask the User for their age
        System.out.print("Enter your age: ");
        int age = subway.nextInt();
        // Apply 10% discount for students (17 or younger)
        if (age <= 17) {
            price = price * 0.90;
        }
        // Apply 20% discount for seniors (65 or older)
        else if (age >= 65) {
            price = price * 0.80;
        }
        // Display final sandwich price
        System.out.printf("Your sandwich costs $%.2f", price);

        // close scanner
        subway.close();


    }
}
