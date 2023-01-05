package algoritmiaCodes.algo.CodingPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComparingAnagramWithMap {

    public static void main(String[] args){
        boolean result = comparingAnagram("listen","silent");
        System.out.println(result);
    }
    static boolean comparingAnagram(String x, String y){
        if (!(x.length()==y.length())){
            return false;
        }else{
            char[] firstString = x.toCharArray();
            char[] secondString = y.toCharArray();
            int i = 0;
            Map<Character,Integer> xMap = new LinkedHashMap<>();
            Map<Character,Integer> yMap = new LinkedHashMap<>();
            while (i!=x.length()){
                if (xMap.containsKey(firstString[i])==false){
                    xMap.put(firstString[i],1);
                }else{
                    int oldValue = xMap.get(firstString[i]);
                    int newValue = oldValue + 1;
                    xMap.put(firstString[i],newValue);
                }
                ++i;
            }
            while (i!=y.length()){
                if (yMap.containsKey(secondString[i])==false){
                    yMap.put(secondString[i],1);
                }else {
                    int oldValue = yMap.get(secondString[i]);
                    int newValue = oldValue + 1;
                    yMap.put(secondString[i],newValue);
                }
                ++i;

            }
            if (xMap.equals(yMap)){
                return true;
            }else
                return false;
        }

    }
}
