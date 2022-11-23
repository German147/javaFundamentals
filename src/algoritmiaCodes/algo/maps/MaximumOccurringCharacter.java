package algoritmiaCodes.algo.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaximumOccurringCharacter {
    public static void main(String[] args) {
        String x = "somestringsss";
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
                map.put(y[i], newValue);
            }
            ++i;
        }

        Set<Map.Entry<Character, Integer>> printMap = map.entrySet();
        char maxKey = ' ';
        int maxVal = 0;
        for (Map.Entry<Character, Integer> data : printMap) {
            if (data.getValue() > maxVal){
                maxVal = data.getValue();
                maxKey = data.getKey();
            }
        }
        System.out.print(maxKey);
        System.out.println(maxVal);
    }
}
