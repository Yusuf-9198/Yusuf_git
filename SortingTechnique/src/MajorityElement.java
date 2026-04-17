/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
 You may assume that the majority element always exists in the array.
*/
public class MajorityElement {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void main() {
        int[] arr = {1,1,2,2,2,2,1,2,4};
        print(arr);
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j >=1; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j,j-1);

                }

            }
        }
        print(arr);
        if(n% 2 == 0)         System.out.println("Majority Element : " + arr[n/2]);
        else         System.out.println("Majority Element : " + arr[(n-1)/2]);


    }
}
