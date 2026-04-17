// Peak Index od a Mountain array
// 10,20,30,40,50,40,20,5
public class PeakIndex {
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 1 , high = n-2;
        while(low <= high){
            int mid = (high - low)/2 + low;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return mid;
            } else if (arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1]) {
                high = mid-1;
            }
            else low= mid+1;


        }
        return -1;
    }

    static void main() {
        int[] arr = {10,20,30,90,50,50,20,5};
        System.out.println(peakIndexInMountainArray(arr));
    }

}
