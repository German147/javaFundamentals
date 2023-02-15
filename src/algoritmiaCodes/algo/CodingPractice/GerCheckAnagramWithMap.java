package algoritmiaCodes.algo.CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class GerCheckAnagramWithMap {
    public static void main(String[] args){
        System.out.print(checkAnagrams("german","nmaerg"));
    }
    static boolean checkAnagrams(String x, String y){
        if (!(x.length() == y.length())){
            return false;
        }else {
            ;
            char[] firstString = x.toCharArray();
            char[] secondString = y.toCharArray();

            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();

            int i = 0;
            while (i!=x.length()){
                if (map1.containsKey(firstString[i])==false){
                    map1.put(firstString[i],1);
                }else {
                    int oldValue = map1.get(firstString[i]);
                    int newValue = oldValue + 1;
                    map1.put(firstString[i],newValue);
                }
                ++i;
            }

            int j = 0;
            while (j!=y.length()){
                if (!(map2.containsKey(secondString[j]))){
                    map2.put(secondString[j],1);
                }else {
                    int oldValue = map2.get(secondString[j]);
                    int newValue = oldValue + 1;
                    map2.put(secondString[j],newValue);
                }
                ++j;
            }
           if (map1.equals(map2)){
               return true;
           }else {
               return false;
           }
        }
    }
}
