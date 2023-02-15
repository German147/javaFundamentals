package CodeSignal_BarreraGerman;
/*
* Given a year, return the century it is in. The first century spans from
* the year 1 up to and including the year 100, the second - from the year 101 up
* to and including the year 200, etc.
* */
import java.util.function.Function;

public class Century {
    public static void main(String[] args) {
        System.out.println("It is number: " + functionalSolution.apply(1905) + " century");
    }
    static Function<Integer, Integer> functionalSolution = solution -> (solution-1) / 100 +1;

    //Other Solutions
    static int solution(int year) {
        float century = year / 100;
        if ((century - (int) century) >= 0.0099) {
            return (int) century + 1;
        }
        return (int) century;
    }

    static int solution2(int year) {
        if (year % 100 == 0) {
            return year / 100;
        } else {
            return year / 100 + 1;
        }
    }

    static int solution3(int year) {
        return (year - 1) / 100 + 1;
    }

}