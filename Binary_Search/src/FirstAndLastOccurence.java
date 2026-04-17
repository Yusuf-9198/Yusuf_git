

// given sorted Array find first and last occurence of elements
public class FirstAndLastOccurence {
    public static int[] searchRange(int[] arr, int target){
        int[] indx = {-1, -1};
        int n = arr.length;
        int lb = n, ub = n;
        int lo = 0, hi = n-1;
        boolean flag = false ;
        while(lo <= hi){
            int mid = (hi - lo)/2 + lo;
            if(arr[mid] == target) {
                flag = true;
                break;
            }
            else if(arr[mid] < target) {
                lo = mid + 1;
            }
            else hi = mid -1;
        }
        if(flag==false) return indx;
        lo = 0 ; hi = n-1;
        while(lo<= hi){
            int mid = (hi - lo)/2 + lo;
            if(arr[mid] >= target){
                lb= Math.min(lb,mid);
                hi = mid - 1;
            }
            else lo = mid+1;
        }
        indx[0]= lb;
        lo = 0; hi = n-1;
        while (lo<=hi){
            int mid = (hi - lo)/2 + lo;
            if(arr[mid] > target){
                ub= Math.min(ub,mid);
                hi = mid - 1;
            }
            else lo = mid+1;

        }
        indx[1] = ub-1;
        return indx;

    }
    static void main() {
        int[] arr ={1,2,3,4,4,4,5,6};
        int[] indx = searchRange(arr,6);
        for (int i = 0; i < 2; i++) {
            IO.print(indx[i]);
        }
    }
}
