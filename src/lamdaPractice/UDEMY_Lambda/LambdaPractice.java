package lamdaPractice.UDEMY_Lambda;

import java.util.function.BiFunction;

public class LambdaPractice {

    public static void main(String[] args) {
        System.out.println(process("Hello World", str -> str.toUpperCase()));
        System.out.println(process2("Hello World", 5, (str, i) -> str.substring(i)));
    }

    private static String process2(String str, int i, BiFunction<String, Integer, String> processor) {
        return processor.apply(str, i);
    }

    private static String process(String str, Processor processor) {
        return processor.process(str);
    }
}
