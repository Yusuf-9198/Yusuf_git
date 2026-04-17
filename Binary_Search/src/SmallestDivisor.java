import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestDivisor {
      // chalega but for large array it will give time limit exceed ;
//    public int smallestDivisor(int[] arr, int threshold) {
//        Arrays.sort(arr);
//        int n =arr.length;
//        int d;
//        for ( d = 1; d <arr[n-1]; d++) {
//            int sum = 0;
//            for (int i = 0; i < n; i++) {
//                if(arr[i] %d ==0) sum += arr[i]/d;
//                else sum += arr[i]/d +1;
//
//            }
//            if(sum <= threshold) return d;
//        }
//        return arr[n-1];
//    }

    public boolean isLess(int mid , int[] arr, int t){
        long sum =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%mid == 0) sum += arr[i]/mid;
            else sum += arr[i]/mid +1;
        }
        if(sum <= t) return true ;
        return false;
    }

    public int smallestDivisor(int[] arr, int t) {
        int mx = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx,arr[i]);
        }
        int lo = 1 , hi = mx;
        int d =mx;
        while(lo <= hi){
            int mid = (hi-lo)/2 + lo;
            if(isLess(mid,arr,t)){
                d= mid;
                hi =mid -1;
            }else lo =mid+1;
        }

        return d;
    }

    void main(){
        int[] arr ={5,1,9,2};
        int t= 6;
        System.out.println(smallestDivisor(arr,t));
    }
}
