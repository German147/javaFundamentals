package com.fundamentals.chapter4c_For_Loop;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        //Ask the user the number of times he wants to go over
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of item you would like to scan, please.");
        int quantity = scanner.nextInt();

        //we generate an accumulator variable to store the amount
        double total = 0;
        //Now lets create a for loop to iterate through all of the items and acumulate the costs
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the cost of the item:");
            double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();
        System.out.println("The total is $ " + total);

    }
}
