package algoritmiaCodes.algo.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacter {
    public static void main(String[] args) {
        String x = "German";
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


        System.out.println(map);
        Set<Map.Entry<Character, Integer>> printMap = map.entrySet();

        for (Map.Entry<Character, Integer> data : printMap) {

            if (data.getValue() > 1){
                System.out.print(data.getKey());
                System.out.println(data.getValue());
            }

        }
    }
}
