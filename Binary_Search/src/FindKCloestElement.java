import java.lang.reflect.Array;
import java.util.*;
import static java.lang.Math.*;
import static java.util.Collection.*;

public class FindKCloestElement {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        ArrayList<Integer> cloestNums = new ArrayList<>(n);
        if(arr[0]>x){
            for (int i = 0; i < k; i++) {
                cloestNums.add(arr[i]);
            }
            return cloestNums;
        }
        if(arr[n-1]<x){
            for (int i = n-1; i >= n-k; i--) {
                cloestNums.add(arr[i]);
            }
            Collections.sort(cloestNums);
            return cloestNums;
        }
        int lo= 0, hi= n-1;
        int lb = n;
        while(lo <= hi){
            int mid = (hi-lo)/2 + lo;
            if(arr[mid] >= x) {
                lb = min(mid,lb);
                hi = mid-1;
            }
            else lo = mid +1 ;
        }
        int i =lb-1, j=lb;
        while(i>-1 && j<n && k>0){
            int di = abs(x-arr[i]);
            int dj = abs(x-arr[j]);
            if(di<=dj){
                cloestNums.add(arr[i]);
                i--;
            }
            else {
                cloestNums.add(arr[j]);
                j++;
            }
            k--;
        }
        while(i<0 && k>0){
            cloestNums.add(arr[j]);
            j++;k--;
        }
        while(j==n && k>0){
            cloestNums.add(arr[i]);
            i--;k--;
        }
        Collections.sort(cloestNums);
        return cloestNums;

    }

    void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 4, x=5;
        System.out.println(findClosestElements(arr,k,x));
    }
}
