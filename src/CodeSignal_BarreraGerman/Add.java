package CodeSignal_BarreraGerman;
// 1er - Code Challenge - Write a function that returns the sum of two numbers.

import java.util.function.BiFunction;

public class Add {
    public static void main(String[] args) {

        System.out.println(functionalSolution.apply(1,2));

    }

    static BiFunction<Integer, Integer, Integer> functionalSolution = (num1, num2) -> num1 + num2;

    int solution(int param1, int param2) {
        BiFunction<Integer, Integer, Integer> solution = (num1, num2) -> num1 + num2;

        int sol = solution.apply(param1, param2);
        return sol;
    }

}
