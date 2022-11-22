package algoritmiaCodes.algo.maps;

import java.util.*;

public class OwnMapII {
    public static void main(String[] args) {
        String x = "somearrayofstring";
        char y[] = x.toCharArray();
        int size = y.length;
        int i = 0;

        Map<Character, Integer> map = new LinkedHashMap<>();

        while (i != size) {
            if (map.containsKey(y[i]) == false) {
                map.put(y[i], 1);
            } else {
                int oldValue = map.get(y[i]);
                int newValue = oldValue + 1;
                map.put(y[i],newValue);
            }
            ++i;
        }
        Set<Map.Entry<Character, Integer>> printMap = map.entrySet();
        for (Map.Entry<Character, Integer> data: printMap){
            System.out.print("Key : " + data.getKey() + " ");
            System.out.println("Value " + data.getValue());
        }
        System.out.println(map);
    }
}
