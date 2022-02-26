package com.fundamentals.chapter4bDo_While_Loop;

import java.util.Scanner;

/*Let's write a program that allows a user to calculate
the sum of two numbers as many times as they like to.*/
public class AddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean again = false;
        do {
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();
            System.out.println("Please, enter the second number:");
            double num2=scanner.nextDouble();

             double sum = num1 + num2;
            System.out.println("The sum is " + sum);

            System.out.println("Would you like to star over?");
            again = scanner.nextBoolean();
        }while(again);

        scanner.close();
    }
}
