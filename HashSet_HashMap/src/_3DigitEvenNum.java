import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class _3DigitEvenNum {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(digits[i])) {
                map.put(digits[i], map.get(digits[i]) + 1);
            } else {
                map.put(digits[i], 1);
            }
        }
        for (int i = 100; i <= 999; i+=2) {
            int x = i;
            int a = x % 10;
            x /= 10;
            int b = x % 10;
            x /= 10;
            int c = x;
            if (map.containsKey(c)) {
                int cfreq = map.get(c);
                map.put(c, cfreq - 1);
                if (cfreq == 1)
                    map.remove(c);
                if (map.containsKey(b)) {
                    int bfreq = map.get(b);
                    map.put(b, bfreq - 1);
                    if (bfreq == 1)
                        map.remove(b);

                    if (map.containsKey(a)) {

                        list.add(i);
                    }

                    map.put(b, bfreq );
                }

                map.put(c, cfreq );

            }


        }
        int[] ans = list.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
}

// more optimised way
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        // Step 1: Count the frequency of each digit (0-9) using a simple array
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }

        ArrayList<Integer> list = new ArrayList<>();

        // Step 2: Iterate through all possible 3-digit even numbers
        // Fix: Changed to i < 1000 to include 998
        for (int i = 100; i < 1000; i += 2) {
            int c = i / 100;          // Hundreds place
            int b = (i / 10) % 10;     // Tens place
            int a = i % 10;            // Ones place

            // Step 3: Check if we have enough of each digit available
            count[c]--;
            count[b]--;
            count[a]--;

            // If none of the counts dropped below 0, it's a valid number!
            if (count[c] >= 0 && count[b] >= 0 && count[a] >= 0) {
                list.add(i);
            }

            // Step 4: Backtrack (Restore the counts for the next number)
            count[c]++;
            count[b]++;
            count[a]++;
        }

        // Step 5: Convert ArrayList to primitive int array (Your exact conversion line!)
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}