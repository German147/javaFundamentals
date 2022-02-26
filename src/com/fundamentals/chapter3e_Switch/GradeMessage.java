package com.fundamentals.chapter3e_Switch;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your letter grade:");
        String grade = scanner.next();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent job!!";
                break;
            case "B":
                message = "Great JOb!";
                break;
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Hu ho ho..you failed!";
                break;
            default:
                message = "Error, this not a grade letter";

        }

        System.out.println(message);

    }
}
