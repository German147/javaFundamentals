package lamdaPractice.AmigosCode;

import java.util.function.BiFunction;

//BiFunction takes two arguments and returns one result
public class BIFunctionSample {

    public static void main(String[] args) {

        int res = biFunctionMultiply.apply(2, 4);


    }


    static BiFunction<Integer, Integer, Integer> biFunctionMultiply = (number1, number2) -> number1 * number2;

    static BiFunction<Integer, Integer, Integer> biFunctionSum = (num1, num2) -> num1 + num2;

    static BiFunction<Integer, Integer, Integer> biFunctionResta = (num1, num2) -> num1 - num2;

}
