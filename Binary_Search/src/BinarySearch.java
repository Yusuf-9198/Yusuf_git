public class BinarySearch {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        int target = 58;
        int low = 0 , high = n-1;
        boolean flag = false ; // Means Not present
        while(low <= high){
//            int mid = (low + high )/2;
            int mid = (high - low)/2 + low; // more prefered
            if(arr[mid] == target) {
                flag = true;
                break;
            }
            else if(arr[mid] < target) {
                low = mid + 1;
            }
            else high = mid -1;
        }
        if(flag == true) IO.println("Traget is present");
        else IO.println("Target not present");


    }
}
