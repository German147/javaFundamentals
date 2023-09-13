package CodeSignal_BarreraGerman;

import java.util.*;
import java.util.stream.Collectors;

//array de numeros, hay que decir si hay o no repetidos
public class RepeatedNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        //System.out.println(repeatedNumbers(arr));
        System.out.println(isRepeatedNumberTrue(arr));
    }

    static public boolean repeatedNumbers(int[] array) {
        HashSet<Integer> myHashSet = new HashSet<>();
        for (int num : array) {
            if (myHashSet.contains(num)) {
                return true;
            } else
                myHashSet.add(num);
        }
        return false;
    }

    //Functional approach.
    static public boolean isRepeatedNumberTrue(int[] array) {
        List<Integer> boxingList = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> distinctNumber = boxingList.stream().distinct().collect(Collectors.toList());
        return distinctNumber.equals(boxingList);
    }

}
