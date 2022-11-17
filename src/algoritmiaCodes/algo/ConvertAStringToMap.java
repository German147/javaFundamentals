package algoritmiaCodes.algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConvertAStringToMap {

    public static void main(String[] args) {
        String x = "lliiopp";
        char y[] = x.toCharArray();
        int size = y.length;
        // here I create a map using Character and Integer as a Key Value pair
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        while (i != size) {
            //Here I say if map contains a certain key and if it s false...
            if (map.containsKey(y[i]) == false) {
                // put that key a value of 1
                map.put(y[i], 1);
            } else {
                //add to the oldValue variable that key with its value
                int oldValue = map.get(y[i]);
                //Here I sum a new value to the Key
                int newValue = oldValue + 1;
                // and put its new value
                map.put(y[i], newValue);
            }
            ++i;
        }


        //in order to print the key value pair I use this forEach loop
        Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
        for (Map.Entry<Character, Integer> data : hmap) {
            System.out.print(data.getKey());
            System.out.println(data.getValue());
        }


    }
}
