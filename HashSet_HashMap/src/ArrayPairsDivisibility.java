import java.util.HashMap;
import java.util.HashSet;

/*Given an array of integers arr of even length n and an integer k.

We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.
Return true If you can find a way to do that or false otherwise.
Example 1:

Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
Output: true
Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).*/
public class ArrayPairsDivisibility {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // int ele = arr[i]%k;
            // if(ele <0) ele+=k;
            int ele = ((arr[i]%k) + k)%k;
            if(map.containsKey(ele))
                map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        if(map.containsKey(0)){
            if(map.get(0)%2!=0) return false;
            map.remove(0);
        }

        for(int ele : map.keySet()){
            int che = k - ele;
            if(!map.containsKey(che)) return false;
            if (!map.get(ele).equals(map.get(che))) return false;        }
        return true;
    }

}
