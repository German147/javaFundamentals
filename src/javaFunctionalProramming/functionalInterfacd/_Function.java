package javaFunctionalProramming.functionalInterfacd;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(3);

        System.out.println(increment);
    }

    //public static Fuction<Integer,Integer> incrementByOneFunction = number -> number + 1;

    static int increment(int number) {
        return number + 9;
    }
}
