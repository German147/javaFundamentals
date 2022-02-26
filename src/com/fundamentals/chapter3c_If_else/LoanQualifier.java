package com.fundamentals.chapter3c_If_else;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String[] args) {

        //Initialize variables
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        Scanner scanner = new Scanner(System.in);

        //Get what we don't have over the console
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employee");
        double years = scanner.nextDouble();

        //As we don use the scanner class, we cloe it.
        scanner.close();

        //Naw lets make a decision
        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats! You are qualified for the loan!");
            } else {
                System.out.println("Sorry, you must be at your current job for more than "
                        + requiredYearsEmployed + " year");
            }
        } else {
            System.out.println("Sorry, you must earn at leas " + requiredSalary +
                    " to qualify for the loan");
        }

    }
}
