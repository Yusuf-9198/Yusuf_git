package Daily_leetcode;

// import java.util.*;
// public class XSum {
//     public int[] findXSum(int[] nums, int k, int x) {
//         int n = nums.length;
//         int[] result = new int[n - k + 1];
//         for (int start = 0; start <= n - k; start++) {
//             Map<Integer, Integer> frequency = new HashMap<>();
//             for (int i = start; i < start + k; i++) {
//                 frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
//             }
//             List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>(frequency.entrySet());
//             freqList.sort((a, b) -> {
//                 int freqCompare = b.getValue().compareTo(a.getValue());
//                 if (freqCompare != 0) return freqCompare;
//                 return b.getKey().compareTo(a.getKey());
//             });
//             int limit = Math.min(x, freqList.size());
//             Set<Integer> topElements = new HashSet<>();
//             for (int i = 0; i < limit; i++) {
//                 topElements.add(freqList.get(i).getKey());
//             }
//             int sum = 0;
//             for (int i = start; i < start + k; i++) {
//                 if (topElements.contains(nums[i])) {
//                     sum += nums[i];
//                 }
//             }
//             result[start] = sum;
//         }
//         return result;
//     }
// }

// optimise form
import java.util.*;

public class XSum {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Initialize frequencies for the first window
        for (int i = 0; i < k; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }
        result[0] = calculateXSum(freqMap, nums, 0, k, x);

        // Slide the window across the array
        for (int start = 1; start <= n - k; start++) {
            // Remove the element leaving the window
            int left = nums[start - 1];
            freqMap.put(left, freqMap.get(left) - 1);
            if (freqMap.get(left) == 0) {
                freqMap.remove(left);
            }
            // Add the new element entering the window
            int right = nums[start + k - 1];
            freqMap.put(right, freqMap.getOrDefault(right, 0) + 1);

            result[start] = calculateXSum(freqMap, nums, start, k, x);
        }

        return result;
    }

    private int calculateXSum(Map<Integer, Integer> freqMap, int[] nums, int start, int k, int x) {
        List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>(freqMap.entrySet());

        freqList.sort((a, b) -> {
            int freqComp = b.getValue().compareTo(a.getValue());
            if (freqComp != 0) return freqComp;
            return b.getKey().compareTo(a.getKey());
        });

        int limit = Math.min(x, freqList.size());
        Set<Integer> topElements = new HashSet<>();
        for (int i = 0; i < limit; i++) {
            topElements.add(freqList.get(i).getKey());
        }

        int sum = 0;
        for (int i = start; i < start + k; i++) {
            if (topElements.contains(nums[i])) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
