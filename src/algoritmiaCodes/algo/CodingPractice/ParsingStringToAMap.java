package algoritmiaCodes.algo.CodingPractice;

import java.util.*;

public class ParsingStringToAMap {
    public static void main(String[] args) {

        String firstString = "MyStringToMapppp";
        char[] y = firstString.toCharArray();
        int size = y.length;
        int i = 0;

        Map<Character, Integer> myMap = new LinkedHashMap<>();

        while (i != size) {
            if (myMap.containsKey(y[i]) == false) {
                myMap.put(y[i], 1);
            } else {
                int oldValue = myMap.get(y[i]);
                int newValue = oldValue + 1;
                myMap.put(y[i],newValue);
            }
            ++i;
        }

        Set<Map.Entry<Character,Integer>> printMap = myMap.entrySet();
        for (Map.Entry<Character,Integer> data: printMap) {
            System.out.print("Key: "+data.getKey());
            System.out.println(" Value " + data.getValue());
        }
    }

}
