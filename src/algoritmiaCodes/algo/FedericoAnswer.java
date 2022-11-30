package algoritmiaCodes.algo;

import java.util.Stack;

public class FedericoAnswer {
    public static void main(String[] args) {

        String result = parseExpression("3[asdf]");
        System.out.println(result);
    }
    public static String parseExpression (String expression) {

        String result = "";
        String accum_chars = "";
        //Multiplier for repeating strings
        int repeat_count = 0;

        //Chose stack for representing the expression as a multi-level structure
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++){
            char curr_char = expression.charAt(i);
            //If current char is a digit, multiply current repeat counter by 10 and add the digit.
            if (Character.isDigit(curr_char)) {
                repeat_count = (repeat_count * 10) + Character.getNumericValue(curr_char);
                //If current char is opening bracket, push counter to the stack, reset the counter, add accumulated characters
                //to the result, reset accumulated chars variable.
            } else if (curr_char == '['){
                stack.push(repeat_count);
                repeat_count = 0;
                result += accum_chars;
                accum_chars = "";
                //If current char is closing bracket, pop the counter from the stack, if there's no accumulated chars,
                //repeat the current result so far, if there's accumulated chars, repeat them and add to current result,
                //reset the accumulated chars variable.
            } else if (curr_char == ']') {
                int times = stack.pop();
                String repeat;
                if (accum_chars.isEmpty()){
                    repeat = result;
                    times --;
                } else {
                    repeat = accum_chars;
                }
                for (int j = 0; j < times; j++){
                    result += repeat;
                }
                accum_chars = "";
                //If char is not a bracket, add the char to accumulated chars variable.
            } else {
                accum_chars += curr_char;
            }
        }
        return result;
    }
}
