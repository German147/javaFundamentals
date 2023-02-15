package _FunctionalCoding;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _BiFunction {
    public static void main(String[] args) {

        int res = biFunctionMultiply.apply(2, 3);
        System.out.println(res);
        biFunctionSum.andThen(multiPlyByTen);
    }

    static BiFunction<Integer, Integer, Integer> biFunctionMultiply = (number1, number2) -> number1 * number2;

    static BiFunction<Integer, Integer, Integer> biFunctionSum = (num1, num2) -> num1 + num2;

    static BiFunction<Integer, Integer, Integer> biFunctionResta = (num1, num2) -> num1 - num2;

    static Function<Integer, Integer> multiPlyByTen = number -> number * 10;

}
