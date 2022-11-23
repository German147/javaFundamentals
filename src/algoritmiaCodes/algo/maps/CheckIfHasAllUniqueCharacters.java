package algoritmiaCodes.algo.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CheckIfHasAllUniqueCharacters {
    public static void main(String[] args) {
        String x = "alguncde";
        char y[] = x.toCharArray();
        int size = y.length;
        int i = 0;

        Map<Character, Integer> map = new HashMap<>();
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
        Set<Map.Entry<Character, Integer>> printMessage = map.entrySet();
        for (Map.Entry<Character, Integer> data : printMessage) {
            if (data.getValue() > 1) {
                System.out.println("It does not contain unique character");
                System.exit(0);
            }
        }
        System.out.println("This contains all unique characters");
    }
}
