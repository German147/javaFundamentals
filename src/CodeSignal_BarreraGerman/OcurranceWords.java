package CodeSignal_BarreraGerman;

import java.util.HashMap;

public class OcurranceWords {

        public static void main(String[] args) {
            String str = "This this is is done by Agustin Agustin";
            str = str.toLowerCase();
            String[] stringArray = str.split(" ");

            HashMap map = new HashMap<>();

            for(String word: stringArray){
                try{
                    map.get(word);
                    map.put(word,(int)map.get(word)+1);
                }catch(Exception e){
                    map.put(word,1);
                }
            }
            System.out.println(map.entrySet());
        }

}
