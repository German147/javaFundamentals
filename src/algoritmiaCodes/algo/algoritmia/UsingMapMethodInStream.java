package algoritmiaCodes.algo.algoritmia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsingMapMethodInStream {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88);

        List<Double> doubleResults = new ArrayList<>();
        for (Integer n : numList) {
            Integer i = n * 2;
            doubleResults.add(Double.valueOf(i));
        }
        Consumer<Double> println = System.out::println;
        doubleResults.forEach(println);
    }
}
