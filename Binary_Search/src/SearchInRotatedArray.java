public class SearchInRotatedArray {
    static int search(int[] arr , int target){
        int n = arr.length;
        // check this code
//        int low = 1 , high = n-2;
//        int pinx = -1;
//        while(low<=high){
//            int mid= (high - low)/2 + low;
//            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid + 1]) {
//                pinx = mid;
//                break;
//            }
//            else  if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid + 1]) {
//                pinx = mid - 1;
//                break;
//            }
//            else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid + 1]) {
//                if (arr[mid] > arr[n-1]) low= mid+1;
//                else high=mid-1;
//            }
//            }
//        int ans = -1;
//        low = 0 ; high = pinx;
//        boolean flag = false ; // Means Not present
//        while(low <= high){
//            int mid = (high - low)/2 + low;
//            if(arr[mid] == target) {
//                flag = true;
//                ans = mid;
//                break;
//            }
//            else if(arr[mid] < target) {
//                low = mid + 1;
//            }
//            else high = mid -1;
//        }
//        if(flag) return ans;
//
//         low = pinx+1 ; high = n-1;
//        while(low <= high){
//            int mid = (high - low)/2 + low;
//            if(arr[mid] == target) {
//                flag = true;
//                ans = mid;
//                break;
//            }
//            else if(arr[mid] < target) {
//                low = mid + 1;
//            }
//            else high = mid -1;
//        }
//        if(flag) return ans;

        int lo =0 , hi = n-1;
        while(lo<=hi){
            int mid = (hi - lo)/2 +lo;
            if(arr[mid] == target) return mid;
            else if (arr[mid] <= arr[hi]) {
                if(target > arr[mid] && target<= arr[hi]) lo = mid + 1;
                else hi = mid -1;
            }
            else {
                if(target >= arr[lo] && target< arr[mid]) hi = mid-1;
                else lo = mid +1 ;
            }
        }
        return  -1;

    }

    static void main() {
        int[] arr = {4,5,6,7};
        int target = 5;
        System.out.println(search(arr,target));
    }
}
