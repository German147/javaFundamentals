package CodeSignal_BarreraGerman;

/*
* Given the string, check if it is a palindrome.
* */

import java.util.function.Predicate;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(functionalSolution.test("racecar"));

    }

    static boolean solution(String original) {
        boolean palindrome = true;
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
        }
        return palindrome;
    }

    static Predicate<String> functionalSolution = palindrome-> {
        boolean res = true;
        String reverse = "";
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reverse += palindrome.charAt(i);
        }
        for (int i = 0; i < palindrome.length(); i++) {
            if (palindrome.charAt(i) != reverse.charAt(i)){
                res = false;
            }
        }
        return res;
    };
}
