public class MinimizedMaximum {
    public boolean isPossible(int[] arr, int maxQ, int n) {
        int stores = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % maxQ == 0) stores += arr[i]/maxQ;
            else stores += arr[i]/maxQ +1;
        }
        if(stores>n) return false;
        return true;
    }

    public int minimizedMaximum(int n, int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            mx = Math.max(mx, arr[i]);
        }
        int maxans =0;
        int lo = 1, hi = mx;
        while(lo<= hi){
            int mid = lo+ (hi-lo)/2;
            if(isPossible(arr, mid, n)){
                maxans = mid;
                hi = mid-1;
            }else lo = mid+1;
       }
       return maxans;
    }
    public void main(String[] args) {
        int[] arr = {11,6};
        int n = 6;
        System.out.println(minimizedMaximum(n, arr));
    }
}