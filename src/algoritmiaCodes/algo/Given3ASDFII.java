package algoritmiaCodes.algo;

import java.util.Arrays;
import java.util.Iterator;

public class Given3ASDFII {
    public static void main(String[] args) {
        System.out.println(getDecodedString("1[abc]2[cda]"));
    }

    public static String getDecodedString(String encoded){
        String[] elements = encoded.split("[\\[\\]]");
        String result = "";
        Iterator<String> iterator = Arrays.stream(elements).iterator();
        while (iterator.hasNext()){
            int number = Integer.parseInt(iterator.next());
            result+=iterator.next().repeat(number);
        }
        return result;
    }

}
