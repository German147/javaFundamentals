package algoritmiaCodes.algo.CodingPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyAnagramUsingMap {

    public static void main(String[] args) {
        boolean result = anagramUsingMap("listen", "listen");
        System.out.println(result);
    }

    static boolean anagramUsingMap(String x, String y) {

        if (!(x.length() == y.length())) {
            return false;
        } else {
            Map<Character, Integer> firstMap = new LinkedHashMap<>();
            Map<Character, Integer> secondMap = new LinkedHashMap<>();

            char[] firstArray = x.toCharArray();
            char[] secondArray = y.toCharArray();

            for (int i = 0; i < firstArray.length; i++) {
                if (firstMap.containsKey(firstArray[i]) == false) {
                    firstMap.put(firstArray[i], 1);
                } else {
                    int oldValue = firstMap.get(firstArray[i]);
                    int newValue = oldValue + 1;
                    firstMap.put(firstArray[i], newValue);
                }
            }
            Set<Map.Entry<Character,Integer>>printMap = firstMap.entrySet();
            System.out.println("First String");

            for (Map.Entry<Character,Integer> data:printMap) {
                System.out.print("Key: " + data.getKey());
                System.out.println(" Value: "+data.getValue());
            }
            for (int i = 0; i < secondArray.length; i++) {
                if (secondMap.containsKey(secondArray[i]) == false) {
                    secondMap.put(secondArray[i], 1);
                } else {
                    int oldValue = secondMap.get(secondArray[i]);
                    int newValue = oldValue + 1;
                    secondMap.put(secondArray[i], newValue);
                }
            }
            Set<Map.Entry<Character, Integer>> printMap2 = secondMap.entrySet();
            System.out.println("Second String");
            for (Map.Entry<Character, Integer> data : printMap2) {
                System.out.print("Key: " + data.getKey());
                System.out.println(" Value: " + data.getValue());
            }
            if (firstMap.equals(secondMap)){
                return true;
            }else return false;
        }
    }
}
