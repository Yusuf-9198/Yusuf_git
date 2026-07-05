import java.util.HashMap;

public class NicePairs {
    static int  rev(int n) {
        int temp = 0;
        while (n != 0) {
            temp = temp * 10 + (n % 10);

            n = n / 10;
        }
        return temp;
    }
        // Time Limit exceeded(Brute force)

//    public int countNicePairs(int[] nums) {
//        int n = nums.length;
//        int count =0 ;
//        for(int i =0 ; i<n-1; i++){
//            for (int j = i+1; j < n; j++) {
//                if(nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
public int countNicePairs(int[] nums) {
    int n = nums.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    int count=0;
    for (int i = 0; i < n; i++) {
        int temp = nums[i] - rev(nums[i]);
        if(map.containsKey(temp)) {
            count += map.get(temp);
            map.put(temp,map.get(temp) +1);
        }
        else map.put(temp, 1);
    }
    // for(int key : map.keySet()){
    //     int t= map.get(key);
    //     if(t > 1) count +=t*(t-1)/2 ;
    // }
    return count;
}
    public static void main(String[] args) {
        System.out.println(rev(1));
    }
}
