package algoritmiaCodes.algo.CodingPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GettingAMapFromAString {
    public static void main(String[] args){
        //Let's parse a string into a map

        String x = "Martina";
        char[] y= x.toCharArray();
        int i=0;

        Map<Character,Integer> myMap = new HashMap<>();
        while (i!=y.length){
            if (myMap.containsKey(y[i])==false){
                myMap.put(y[i],1);
            }else{
                int oldValue = myMap.get(y[i]);
                int newValue = oldValue + 1;
                myMap.put(y[i],newValue);
            }
            ++i;
        }
        Set<Map.Entry<Character,Integer>> printMap = myMap.entrySet();
        for (Map.Entry<Character,Integer> data: printMap) {
            System.out.print(data.getKey()+" ");
            System.out.println(data.getValue());
        }


    }
}
