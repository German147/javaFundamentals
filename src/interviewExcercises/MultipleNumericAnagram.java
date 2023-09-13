package interviewExcercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Input:
 * String line = "123 456 231 546 231 312 4556";
 *
 * Output:
 * 123, 231, 231, 312 - are numeric anagrams
 * 456, 546 - are numeric anagrams
 * 4556 - has no anagrams
 **/
public class MultipleNumericAnagram {
    public static void main(String[] args) {

        String line = "231 546 123 456 231 312 4556 7689";

        String[] splitted = line.split(" ");

        Map<String,String> mapped = new HashMap<>();

        for(int i=0;i<splitted.length;i++){

            char[] solution = splitted[i].toCharArray();
            Arrays.sort(solution);
            String sorted = new String(solution);
            if(mapped.containsKey(sorted)){
                String auxiliar = mapped.get(sorted);
                auxiliar = auxiliar +" "+splitted[i];
                mapped.replace(sorted,auxiliar);
            }else{
                mapped.put(sorted, splitted[i]);
            }
        }

        System.out.println("Output:");

        for(Map.Entry<String,String> entry : mapped.entrySet()){

            System.out.print(entry.getValue());

            if(entry.getValue().split(" ").length>1){
                System.out.println(" - are numeric anagrams");
            }
            else
                System.out.println(" - has no anagrams");
        }

    }
}
