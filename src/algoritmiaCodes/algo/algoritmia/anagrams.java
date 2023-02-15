package algoritmiaCodes.algo.algoritmia;

import java.util.Arrays;
import java.util.List;

public class anagrams {
    public static void main(String[] args) {
        boolean result = isAnagram("silent","listen");
        System.out.println(result);
    }
    public static boolean isAnagram(String string1, String string2) {

        if (string1.length() != string2.length()) {
            return false;
        } else {
            //split in array of letters
            String [] word1 = string1.split("(?!^)");
            String [] word2 = string2.split("(?!^)");

            //sort and compare
            System.out.println(Arrays.toString(word1));
            System.out.println(Arrays.toString(word2));



            if (word1 == word2) {
                return true;
            } else {
                return false;
            }


        }
        //return true;
        // return word1List.equals(word2List);
    }
}
