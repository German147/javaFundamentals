package algoritmiaCodes.algo.WorkingWithStrings;

public class ReverseStringII {
    public static void main(String[] args) {

    //reverseWord("german");
        reverseWordJava("La casa de papel");

    }
    public static void reverseWord(String word) {
        System.out.println(word + " <-- in reverse is -->");
        StringBuilder stringBuilder = new StringBuilder(word);
        word = stringBuilder.reverse().toString();

        System.out.println(word);
    }
/*
* Other form ov reverse
*
* */
    public static void reverseWordJava(String word) {
        System.out.println(word + " <-- in reverse -->");
        char[] ch = word.toCharArray();
        int begin = 0;
        int end = ch.length-1;
        char temp;
        while(end>begin){
            temp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = temp;
            end--;
            begin++; }
        word = new String(ch);
        System.out.println(word);
    }
}
