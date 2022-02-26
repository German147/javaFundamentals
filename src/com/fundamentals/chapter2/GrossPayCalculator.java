package com.fundamentals.chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the number of hours the employee worked");
        int hours = scanner.nextInt();

        System.out.println("Please entre the employee rate: ");
        float rate = scanner.nextFloat();

        float grossPay = rate * hours;

        System.out.println(grossPay);
    }
}
