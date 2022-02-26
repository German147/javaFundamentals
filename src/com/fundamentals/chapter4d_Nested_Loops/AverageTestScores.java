package com.fundamentals.chapter4d_Nested_Loops;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {

        //Initialize variables that we know
        int numberOfStudents = 2;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);

        //Process all students
        for (int i = 0; i < numberOfStudents; i++) {
            //Here we declare an accumulator variable for the total sum up of the test qualifications
            double total = 0;
            for (int j = 0; j < numberOfTests; j++) {
                int showingTestNumber = 1;//here is just to inform the user the number of test
                System.out.println("Please, enter the test score #" + (j + showingTestNumber));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total / numberOfTests;
            int showingStudentNumber = i + 1;
            System.out.println("The test average for the student #" + showingStudentNumber + " is " + average);
        }
        scanner.close();
    }
}
