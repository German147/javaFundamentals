package algoritmiaCodes.algo.WorkingWithStrings;
/*3. Given this input: “3[asdf]” you have to generate an output string: asdfasdfasdf
# Q1
## input => “3[asdf]”
## output => “asdfasdfasdf”
# Q2
## input => “3[a]4[b]”
## output => “aaabbbb”
* */
public class Given3asdf {
    public static void main(String[] args) {
        String result = multiplyStringInParenthesis( "3[a2[b]]");
        System.out.println(result);

    }
    public static String multiplyStringInParenthesis(String inputString){
        int startIndex, endIndex, multiplier;
        while (inputString.contains("[")){
            startIndex = inputString.lastIndexOf("[");
            endIndex = inputString.indexOf("]", startIndex);
            multiplier = Character.getNumericValue(inputString.charAt(startIndex - 1));
            String multipliedString = inputString.substring(startIndex + 1, endIndex);
            System.out.println(multipliedString);
            inputString = inputString.replace(inputString.substring(startIndex - 1, endIndex + 1), multipliedString.repeat(multiplier));
            System.out.println(inputString);
        }
        return inputString;
    }
}
