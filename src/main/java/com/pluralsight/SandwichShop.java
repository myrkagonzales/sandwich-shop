package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        // Import Scanner
        Scanner sándwich = new Scanner(System.in);

        // ask user which size sandwich they want
        System.out.print("Enter sandwich size (1-Regular, 2-Large): ");
        int size = sándwich.nextInt();

        // Variable to store sandwich price
        double price;

        // Price determined
        if (size == 1) {
            price = 5.45;
        } else {
            price = 8.95;
        }
        // Ask user if they want a loaded sandwich
        System.out.print("Would you like a loaded sandwich? (Yes/No: ");
        String loaded = sándwich.next();
        // add extra charge for loaded sandwiches
        if (loaded.equalsIgnoreCase("Yes")) {
            if (size == 1) {
                price += 1.00; // added extra amount to a regular loaded sandwich
            } else {
                price += 1.75; // added extra amount to a large loaded sandwich
            }
        }
        // Ask the User for their age
        System.out.print("Enter your age: ");
        int age = sándwich.nextInt();
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
        sándwich.close();


    }
}
