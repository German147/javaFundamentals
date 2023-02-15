package CodeSignal_BarreraGerman;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//11th challenge,level 3
/*Ticket numbers usually consist of an even number of digits.
A ticket number is considered lucky if the sum of the first half of the digits is equal
to the sum of the second half.
Given a ticket number n, determine if it's lucky or not.

Example:
For n = 1230, the output should be
solution(n) = true;
For n = 239017, the output should be
solution(n) = false.*/
public class Exercice11 {
    public static void main(String[] args) {

//        boolean answer = isALuckyNumber(424424);
//        System.out.println(answer);
        boolean res = isLuckyNumberII(239017);
        System.out.println(res);
    }

    public static boolean isALuckyNumber(Integer num) {
        boolean res = false;
        String number = num.toString();

        if (number.length() % 2 != 0) {
            res = false;
        } else {
            System.out.println("el numero tiene " + number.length() % 10 + " digits");
            char[] firstHalf = number.toCharArray();
            System.out.println("CharArray is:" + firstHalf.length);
            //here I convert the string into an array
            String[] stringArray = number.split("");
            System.out.println("The new Split ..." + Arrays.toString(stringArray));
            int size = number.length() % 10 / 2;
            System.out.println("el size es de " + size);

            //Here I create the first half array of integer using Integer.valueof()
            Integer[] firstHalfArray = new Integer[size];
            for (int i = 0; i < size; i++) {
                firstHalfArray[i] = Integer.valueOf(stringArray[i]);
            }
            System.out.println("Array of First half is " + Arrays.toString(firstHalfArray));
            //Now let's add each element
            int sumFirstHalf = 0;
            for (int i = 0; i < firstHalfArray.length; i++) {
                sumFirstHalf += firstHalfArray[i];
            }
            System.out.println("The sum of the first half is: " + sumFirstHalf);

            //to create the second half I have to reverse the string
            StringBuilder reverserd = new StringBuilder();
            for (int i = stringArray.length; i > 0; i--) {
                reverserd.append(stringArray[i - 1]).append(" ");
            }
            String[] reversedArray = reverserd.toString().split(" ");
//        Arrays.stream(reversedArray).forEach(value -> System.out.print(value));


            Integer[] secondHalfArray = new Integer[size];
            for (int i = 0; i < size; i++) {
                secondHalfArray[i] = Integer.valueOf(reversedArray[i]);
            }
//        Arrays.stream(secondHalfArray).forEach(x -> System.out.print("Second half"+x));
            System.out.println("Second half " + Arrays.toString(secondHalfArray));

            int sumSecondHalf = 0;
            for (int i = 0; i < secondHalfArray.length; i++) {
                sumSecondHalf += secondHalfArray[i];
            }
            System.out.println("The sum of the second half is: " + sumSecondHalf);
            if (sumFirstHalf == sumSecondHalf) {
                res = true;
            }
        }
        return res;
    }

    public static boolean isLuckyNumberII(int n) {
        String ticket = n + "";
        Integer number1 = 234556;
        String updateInteger = number1.toString();
        int sum = 0;
        int size = ticket.length();
        for (int letter = 0; letter < size / 2; letter++) {
            int leftNumbers = ticket.charAt(letter);
            int rightNumbers = ticket.charAt(size - letter - 1);
            sum += leftNumbers - rightNumbers;
        }

        return sum == 0;
    }
}