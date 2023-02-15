package algoritmiaCodes.algo.CodingPractice;

import java.io.*;
import java.util.*;

class MyCode {
    public static void main(String[] args){
        String x = "silent";
        String y = "listen";

        LinkedHashMap<Character, Integer> wordOne = new LinkedHashMap<>();

        stringToMap(x,wordOne);


        LinkedHashMap<Character, Integer> wordTwo = new LinkedHashMap<>();

        stringToMap(y,wordTwo);

        boolean res = checkingAnagrams(wordOne,wordTwo);
        System.out.println(res);

    }

    static void stringToMap(String x, LinkedHashMap<Character, Integer> map){
        int i = 0;
        char[] word = x.toCharArray();
        while(i!=x.length()){
            if(!(map.containsKey(word[i]))){
                map.put(word[i],1);
            }else{
                int oldValue = map.get(word[i]);
                int updateValue = oldValue + 1;
                map.put(word[i], updateValue);
            }
            ++i;
        }
    }
    static boolean checkingAnagrams(LinkedHashMap<Character, Integer> x,LinkedHashMap<Character, Integer> y){

        if(x.equals(y)){
            return true;
        }else{
            return false;
        }

    }
}

/**
 * class MyCode {
 * public static void main(String[] args){
 *   String x = "silent";
 *   String y = "listen";
 *
 *   LinkedHashMap<Character, Integer> wordOne =  stringToMap(x);
 *
 *   LinkedHashMap<Character, Integer> wordTwo = stringToMap(y);
 *
 *     boolean res = checkingAnagrams(wordOne,wordTwo);
 *     System.out.println(res);
 *
 * }
 *
 * static LinkedHashMap<Character, Integer> stringToMap(String x ){
 *     int i = 0;
 *     char[] word = x.toCharArray();
 *     LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
 *     while(i!=x.length()){
 *     if(!(map.containsKey(word[i]))){
 *       map.put(word[i],1);
 *     }else{
 *       int oldValue = map.get(word[i]);
 *       int updateValue = oldValue + 1;
 *       map.put(word[i], updateValue);
 *     }
 *     ++i;
 *
 * }
 *   return map;
 * }
 * static boolean checkingAnagrams(LinkedHashMap<Character, Integer> x,LinkedHashMap<Character, Integer> y){
 *
 *   if(x.equals(y)){
 *     return true;
 *   }else{return false;}
 *   }
 * }
 */