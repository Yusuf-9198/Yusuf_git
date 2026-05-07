public class JumpGameIXLeet3660 {
    public int[] maxValue(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0];

        int[] ans = new int[n];
        int[] maxPre = new int[n];

        maxPre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            maxPre[i] = Math.max(maxPre[i - 1], arr[i]);
        }

        int currentMinSuf = Integer.MAX_VALUE;
        
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1 || maxPre[i] <= currentMinSuf) {
                ans[i] = maxPre[i];
            } else {
                ans[i] = ans[i + 1];
            }
            
            currentMinSuf = Math.min(currentMinSuf, arr[i]);
        }

        return ans;
    }
}