package algoritmiaCodes.algo.algoritmia;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class anagrams {
    public static void main(String[] args) {
//        boolean result = isAnagram("silent", "listen");
//        System.out.println(result);

        System.out.println(isAnagramFunctionalApproach("germ","luis"));
    }

    public static boolean isAnagram(String string1, String string2) {

        if (string1.length() != string2.length()) {
            return false;
        } else {
            //split in array of letters
            String[] word1 = string1.split("(?!^)");
            String[] word2 = string2.split("(?!^)");

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

    public static boolean isAnagramFunctionalApproach(String word1, String word2) {
       return Stream.of(word1.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(Stream.of(Arrays.stream(word2.toLowerCase().split(""))
                        .sorted()
                        .collect(Collectors.joining())));
    }
}
