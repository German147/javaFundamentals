package interviewExcercises;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4,5};
        System.out.println(Arrays.toString(twoSum(arr, 5)));

    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{
                        map.get(target - numbers[i]), i};
            }
            map.put(numbers[i], i);
        }
        return new int[]{};
    }

}
