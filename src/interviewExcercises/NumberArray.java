package interviewExcercises;

import java.util.HashSet;
import java.util.function.Predicate;

public class NumberArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(repeatedNumber.test(arr));
    }

    static Predicate<int[]> repeatedNumber = arr -> {
        boolean hasRepeatedNumber = true;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : arr) {
            if (hashSet.contains(num)) {
                return true;
            } else hashSet.add(num);
            hasRepeatedNumber = false;
        }
        return hasRepeatedNumber;
    };

    public static boolean repeatedNumbers(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : arr) {
            if (hashSet.contains(num)) {
                return true;
            } else hashSet.add(num);
        }
        return false;
    }
}
