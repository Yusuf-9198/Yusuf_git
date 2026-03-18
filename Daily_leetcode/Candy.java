package Daily_leetcode;

class Candy1 {
    public int candy(int[] rating) {
        int n = rating.length;
        // Create an array to keep track of how many candies each child gets
        int[] candy1 = new int[n];

        // STEP 1: Give every child at least 1 candy initially
        for (int i = 0; i < n; i++) {
            candy1[i] = 1;
        }

        // STEP 2: Left-to-Right Pass
        // Check if the current child has a higher rating than the child on the LEFT
        for (int i = 1; i < n; i++) {
            if (rating[i] > rating[i - 1]) {
                // If yes, give them 1 more candy than the left neighbor
                candy1[i] = candy1[i - 1] + 1;
            }
        }

        // STEP 3: Right-to-Left Pass
        // Check if the current child has a higher rating than the child on the RIGHT
        for (int i = n - 2; i >= 0; i--) {
            if (rating[i] > rating[i + 1]) {
                /** * If yes, they need more candy than the right neighbor (candy1[i+1] + 1).
                 * We use Math.max to make sure we don't break the rule established 
                 * in the Left-to-Right pass.
                 */
                candy1[i] = Math.max(candy1[i + 1] + 1, candy1[i]);
            }
        }

        // STEP 4: Sum up all the candies in the array to get the final answer
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += candy1[i];
        }
        return sum;
    }
}

public class Candy {
    public static void main(String[] args) {
        int[] rating = {1, 2, 1, 2, 1};
        Candy1 c = new Candy1();
        
        // Expected output for {1, 2, 1, 2, 1} would be: 1+2+1+2+1 = 7
        System.out.println("Total candies needed: " + c.candy(rating));
    }
}