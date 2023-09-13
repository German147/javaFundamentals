package CodeSignal_BarreraGerman;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static java.util.Arrays.*;

public class AdjacentNumberProduct {
    public static void main(String[] args) {

    }

    public static int solution(int[] inputArray) {

        //input : ->  array of int => int[]
        //output : -> max producr -> int
        //goal : retur max product of adjacent pairs

        //1. Create a var to s tore a max value
        int maxProduct = inputArray[0] * inputArray[1];
        //2. Iterate through the array compare pairs (pos=position)
        for(int pos = 1; pos<inputArray.length -1 ; pos++){
            //3. If that pair returns largest product store it in maxVariable
            if(maxProduct < inputArray[pos] * inputArray[pos + 1]) {
                maxProduct = inputArray[pos] * inputArray[pos + 1];
            }
        }
        //4. Return it
        return maxProduct;
    }


    public static int functionalStreamSolution(int[] inputArray){


        return 0;
    }
}
