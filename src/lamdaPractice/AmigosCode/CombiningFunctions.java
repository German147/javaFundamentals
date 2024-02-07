package lamdaPractice.AmigosCode;

import java.util.function.Function;

public class CombiningFunctions {
    public static void main(String[] args) {

        Function<Integer, Integer> addAndMultiply = incrementBuOne.andThen(multiplyBy3);
        System.out.println(addAndMultiply.apply(4));
    }

    static Function<Integer, Integer> incrementBuOne = num -> num + 1;
    static Function<Integer, Integer> multiplyBy3 = num -> num * 3;
}
