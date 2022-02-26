package com.fundamentals.chapter1;

import java.util.Scanner;

/*Create a program that asks a user for a season of the year,
 then a whole number, then an adjective.
And use the input to complete the sentence below. Output the result.*/
public class MadLibs1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a season");
        String season = scanner.nextLine();

        System.out.println("Now, enter a positive adjective");
        String adjective = scanner.nextLine();

        System.out.println("Now enter a number from one to ten");
        int num = scanner.nextInt();

        System.out.println("On a " + adjective + " " + season +
                " day I drink a" + " minimum of " + num + " cups of coffee");
    }
}
