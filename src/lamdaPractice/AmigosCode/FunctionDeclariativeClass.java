package lamdaPractice.AmigosCode;

import java.util.function.Function;

public class FunctionDeclariativeClass {
    public static void main(String[] args) {

        System.out.println(incrementOne(4));
        System.out.println("hi I am the function "+incrementByOne.apply(4));

    }

    static Function<Integer,Integer> incrementByOne = number -> number + 1;
    static int incrementOne(int num){
        return num + 1;
    }
}
