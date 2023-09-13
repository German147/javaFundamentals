package algoritmiaCodes.algo.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CreatingANewPracticeMapFromString {

        public static void main(String[] args) {
        countCharacters("AquiPonemosAlgunaCadena");

        }

        public static void countCharacters(String string){
                String x = string;
                char y[] = x.toCharArray();
                int size =y.length;

                // here I create a map using a Character and an Integer as parameters
                Map<Character, Integer> map = new LinkedHashMap<>();
                int i = 0;
                while (i != size){
                        //if (map.contains) a certain key and if it is false...
                        if(map.containsKey(y[i])==false){
                        //put that key a value of 1
                                map.put(y[i], 1);
                        }else{
                           //add to this variable  that key with its value
                           int oldValue = map.get(y[i]);
                           //here I add a new value to the key
                           int updatedValue = oldValue + 1;
                           //now I put this new value to that iteration
                           map.put(y[i],updatedValue);
                        }
                        i++;
                }

                //to print I can use the following...
                Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
                for (Map.Entry<Character,Integer> data: hmap) {
                        System.out.println("Key " + data.getKey() + " and  " +"Value " + data.getValue() );
                }


        }

}
