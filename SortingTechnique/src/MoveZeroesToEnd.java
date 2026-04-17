import java.util.ArrayList;

public class MoveZeroesToEnd {
    public void movezores(int[] arr) {
        // Not a good Idea because S.C = O(n)
//        ArrayList<Integer> arr = new ArrayList();
//        int noz = 0;
//        for(int ele: nums){
//            if(ele != 0) arr.add(ele);
//            else noz++;
//        }
//        for (int i = 1; i <noz ; i++) {
//            arr.add(0);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = arr.get(i);
//        }

        // Same Bubble sort concept[biggest number at end in every pass]
        int noz = 0;
        int n= arr.length;
        for(int ele: arr){
            if(ele == 0) noz++;
        }
        for (int k = 0; k < noz; k++) {
            for (int i = 0; i < n - 1 - k ; i++) {
                if(arr[i]==0){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1] = temp;
                }
            }

        }

    }

}
// more optimise for runtime
/*
class Solution {
    static {
        for(int i = 0; i < 500; i++)
            moveZeroes(new int[]{});
    }
    public static void moveZeroes(int[] nums) {
        int i = 0;
        for(int j=0;j<nums.length;j++) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }
        }
        for(int k=i;k<nums.length;k++) {
            nums[k] = 0;
        }
    }
}
*/

