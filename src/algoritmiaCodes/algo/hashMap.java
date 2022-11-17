package algoritmiaCodes.algo;

import java.util.HashMap;
import java.util.TreeMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> familyAge = new HashMap<>();
        familyAge.put("German", 39);
        familyAge.put("Evange",42);
        familyAge.put("Martina", 6);
        familyAge.put("Leandro", 9);

        //System.out.println(familyAge);
        System.out.println(familyAge.get("Leandro"));

        TreeMap<Integer, String> familyAgeII = new TreeMap<>();

        familyAgeII.put(39,"German");
        familyAgeII.put(42,"Evange");
        familyAgeII.put(6,"Martina");
        familyAgeII.put(9,"Leandro");

        System.out.println("Here is the treeMap");
        System.out.println(familyAgeII);
        System.out.println(familyAgeII.get(89));

    }
}
