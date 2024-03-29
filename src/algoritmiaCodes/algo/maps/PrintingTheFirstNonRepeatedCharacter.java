package algoritmiaCodes.algo.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintingTheFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String x = "SILLYSPIDERS";
        char y[] = x.toCharArray();
        int size = y.length;

        Map<Character, Integer> map = new LinkedHashMap<>();

        int i = 0;
        while (i != size) {
            if (map.containsKey(y[i]) == false) {
                map.put(y[i], 1);
            } else {
                int oldValue = map.get(y[i]);
                int newValue = oldValue + 1;
                map.put(y[i], newValue);
            }
            ++i;
        }

        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        for (Map.Entry<Character, Integer> data : hmap) {
            if (data.getValue() == 1) {
                System.out.println("The first non repeated character is: " + data.getKey());
                System.exit(0);
            }
        }
    }
}
