package algoritmiaCodes.algo.algoritmia;

import java.util.HashMap;
import java.util.Map;

public class TwoSumNumber {
    public static void main(String[] args) {

        int[] numArray = {5, 2, 4};
        int target = 6;

        System.out.println(twoSumWithMAp(numArray, target));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }


    public static int[] twoSumWithMAp(int[] nums, int target) {

        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }


    public static int[] newToSumMap(int[] sum, int target) {

        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < sum.length; i++) {
            Integer complementIndex = complements.get(sum[i]);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target - sum[i], i);
        }
        return sum;
    }

    public static int[] theNewToSumNumber(int[] num, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            Integer complement = map.get(num[i]);
            if (complement != null) {
                return new int[]{i, complement};
            }
            map.put(target - num[i], i);
        }
        return num;
    }

    public static int[] thirdTwoSumNum(int[] sum, int target) {

        Map<Integer, Integer> complement = new HashMap<>();
        for (int i = 0; i < sum.length; i++) {
            Integer valueIndex = complement.get(sum[i]);
            if (valueIndex != null) {
                return new int[]{i, valueIndex};
            }
            complement.put(target - sum[i], i);
        }
        return sum;
    }
}
