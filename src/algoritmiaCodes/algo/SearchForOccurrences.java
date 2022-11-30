package algoritmiaCodes.algo;

import java.util.*;

public class SearchForOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 4, 5,};
        boolean result = uniqueOccurrences(arr);
        System.out.println(result);
    }

    public static boolean uniqueOccurrences(int[] arr) {
        // Store the frequency of elements in the unordered map.
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Store the frequency count of elements in the unordered set.
        Set<Integer> freqSet = new HashSet<>(freq.values());

        // If the set size is equal to the map size,
        // It implies frequency counts are unique.
        return freq.size() == freqSet.size();
    }
}
