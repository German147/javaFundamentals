package com.fundamentals.chapter4c_For_Loop;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        //Get a text from the user
        System.out.println("Enter a text as long as you wish, please.");
        Scanner scanner = new Scanner(System.in);
        String text=scanner.nextLine();
        scanner.close();

        boolean letterFound = false;
        //lets search for the letter A
        for (int i = 0; i < text.length(); i++) {
            //aqui el loop busca siempre en el primero la letra A, y se reinicia automaticamente
            //letra por letra
            char currentLetter = text.charAt(i);
            if (currentLetter=='A'||currentLetter=='a'){
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("In the text there is a lettre 'A' ");
        }else{
            System.out.println("There is not a letter A in the text.");
        }

    }
}
