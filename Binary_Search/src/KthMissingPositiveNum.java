public class KthMissingPositiveNum {
    // Not Optimise
//    public boolean isPresent(int[] arr , int i){
//        int n = arr.length;
//        for (int j = 0; j < n; j++) {
//            if(arr[j] == i) return true;
//        }
//        return false;
//    }
//    public int findKthPositive(int[] arr, int k) {
//        int n = arr.length;
//        int[] ans = new int[2001];
//        int j =0;
//        for (int i = 1; i <2002 ; i++) {
//            if(!isPresent(arr,i)){
//                ans[j] = i;
//                j++;
//            }
//        }
//        return ans[k-1];
//    }

    public int findKthPositive(int[] arr, int k){
        int n = arr.length;
        int lo =0 , hi=n-1;
        int mis =0;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            mis = arr[mid] -(mid +1);
            if(mis < k) {
                lo = mid +1;
            }
            else hi = mid-1;

        }
        return k+lo;
    }
    void main() {
        int[] arr = {1,2,3,4};
        int k = 2;
        System.out.println(findKthPositive(arr, k));

    }

}
