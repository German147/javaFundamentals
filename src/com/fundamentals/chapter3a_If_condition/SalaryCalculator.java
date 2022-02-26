package com.fundamentals.chapter3a_If_condition;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        int salary = 1000;
        int bonus = 250;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sales did the employee make this week? ");
        int sales = scanner.nextInt();

        if (sales>=0)
            salary = salary+bonus;

        System.out.println("The employee's pay is $ " + salary);
    }
}
