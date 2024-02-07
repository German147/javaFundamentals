package algoritmiaCodes.algo.algoritmia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GettingSpecificValueFromMap {
    public static void main(String[] args) {

        System.out.println("These are the keys of the value 2 "+gettingValue2(germanMap()));
        System.out.println("These are the Values of 'a' "+ gettingKey(germanMap()));
    }

    public static HashMap<String, Integer> germanMap() {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("a", 1);
        myMap.put("b", 2);
        myMap.put("c", 3);
        myMap.put("d", 2);
        myMap.put("e", 4);
        myMap.put("f", 2);
        return myMap;
    }

    public static List<String> gettingValue2(HashMap<String, Integer> map) {
        List<String> myList = map
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return myList;
    }
    public static List<Integer> gettingKey(HashMap<String, Integer> map){
        List<Integer> myList = map
                .entrySet()
                .stream()
                .filter(entry -> entry.getKey() == "a")
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
        return myList;
    }
}
