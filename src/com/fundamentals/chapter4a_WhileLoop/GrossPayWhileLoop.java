package com.fundamentals.chapter4a_WhileLoop;

import java.util.Scanner;

public class GrossPayWhileLoop {
    public static void main(String[] args) {
        //Initialize known variables
        int rate = 15;
        int maxHours = 40;
        int minimumHour = 1;

        //Get the input to know the variables
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate the input

        while (hoursWorked > maxHours || hoursWorked < minimumHour) {
            System.out.println("Invalid Entry. You must be between 1 and 40 hours. Try again, please.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //Calculate groos pay
        double grossPay = rate * hoursWorked;
        System.out.println(grossPay);

    }
}
