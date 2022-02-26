package com.fundamentals.chapter3b;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        //Initialize variables
        int quota = 10;
        Scanner scanner = new Scanner(System.in);
        //Get unknown values
        System.out.println("Enter the number of sales you did this week: ");
        int sales = scanner.nextInt();
        scanner.close();
        //Make a decision on the path to take - Output
        if (sales >= quota) {
            System.out.println("Congrats! you Have met your Quota!!");
        } else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were "
                    + salesShort + " salesShort");
        }
    }
}
