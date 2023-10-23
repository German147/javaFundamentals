package CodeSignal_BarreraGerman;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

import static java.util.Arrays.*;

public class AdjacentNumberProduct {
    public static void main(String[] args) {
    int[] arrayGerman = {3,6,-2,-5,7,3};
        System.out.println(solution4(arrayGerman));
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

    public static int solution3(int[] inputArray){
        int firstProduct = inputArray[0] * inputArray[1];

        for (int i = 0; i < inputArray.length - 1;i++){
            int temporary = inputArray[i] * inputArray[i + 1];

            if (firstProduct < temporary){
                firstProduct = temporary;
            }
        }
        return  firstProduct;
    }

    //here we have to find the highest product of the adjacent number in an array and print it out

    public static int solution4(int[] inputArray){

//first I declare a variable with the first product of the first two numbers
         int firstProduct = inputArray[0] * inputArray[1];

         for (int i = 0 ; i < inputArray.length - 1; i++){
               int temporary = inputArray[i] * inputArray[i + 1];

               if (firstProduct < temporary){
                   firstProduct = temporary;
               }
         }

        return firstProduct;
    }


}
