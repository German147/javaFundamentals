package algoritmiaCodes.algo.CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class AnagramHashmap {

    public static void main(String[] args) {
        System.out.println(anagramHashmap("german","manger"));
    }
    static boolean anagramHashmap(String firstWord, String secondWord) {

        if (!(firstWord.length() == secondWord.length())){
            return false;
        } else {
            Map<Character, Integer> firstHashMap = new HashMap<>();
            Map<Character, Integer> secondHashMap = new HashMap<>();

            char[] firstArray = firstWord.toCharArray();
            char[] secondArray = secondWord.toCharArray();

            for (int i = 0; i < firstArray.length; i++) {
                if (!(firstHashMap.containsKey(firstArray[i]))) {
                    firstHashMap.put(firstArray[i], 1);
                } else {
                    Integer c = firstHashMap.get(firstArray[i]);
                    firstHashMap.put(firstArray[i], c++);
                }
            }
            for (int j = 0; j < secondArray.length; j++) {
                if (!(secondHashMap.containsKey(secondArray[j]))) {
                    secondHashMap.put(secondArray[j], 1);
                } else {
                    Integer c = (int)secondHashMap.get(secondArray[j]);
                    secondHashMap.put(secondArray[j], c++);
                }
            }
            if (firstHashMap.equals(secondHashMap)) {
                return true;
            } else return false;
        }
    }
}
