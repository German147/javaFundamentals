package algoritmiaCodes.algo.CodingPractice;

import java.util.*;

public class CreatingAnagrams {
    public static void main(String[] args) {

        String word1 = (getNonRepetedCharactrerWord("luuucaaasccul"));
        String word2 = (getNonRepetedCharactrerWord("lgermansssdfrl"));
        comparingWords(word1, word2);

    }

    static String getNonRepetedCharactrerWord(String x) {
        int i = 0;
        char[] firstWord = x.toCharArray();

        Map<Character, Integer> map1 = new LinkedHashMap<>();

        while (i != x.length()) {
            if (map1.containsKey(firstWord[i]) == false) {
                map1.put(firstWord[i], 1);
            } else {
                int oldValue = map1.get(firstWord[i]);
                int newValue = oldValue + 1;
                map1.put(firstWord[i], newValue);
            }
            ++i;
        }
        Set<Map.Entry<Character, Integer>> getNonRepetedCharactrerWord = map1.entrySet();
        String nonRepeated = "";

        for (Map.Entry<Character, Integer> data : getNonRepetedCharactrerWord) {
            nonRepeated = nonRepeated + data.getKey();
        }

        return nonRepeated;
    }

    static String comparingWords(String x, String y) {
        int i = 0;
        char[] firstWord = x.toCharArray();
        int j = 0;
        char[] secondWord = y.toCharArray();
        Map<Character, Integer> map11 = new LinkedHashMap<>();
        Map<Character, Integer> map2 = new LinkedHashMap<>();

        while (i != x.length()) {
            if ((firstWord[i] != secondWord[j])) {
                map11.put(firstWord[i], 1);
            } else {
                int oldValue = map11.get(firstWord[i]);
                int newValue = oldValue + 1;
                map11.put(firstWord[i], newValue);
            }
            ++i;
        }
        System.out.println(map11);


        return null;
    }
}


