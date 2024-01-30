package arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] testArray = {2,4,6,8,10};
        System.out.println(addArraysNumbers(testArray));
    }
    public static int addArraysNumbers(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
//        Arrays.stream(array).forEach(a->);
        return total;
    }
}
