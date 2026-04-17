import java.util.Scanner;

// In each pass put the kth maximum element at the right position
public class SelectionSortDifferentmethod {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void main() {
        int[] arr = {0,-1,3,2,-89,6};
        print(arr);
        int n= arr.length;
        // Selection Sort
        for (int i = n-1; i >0; i--) {
            int max = Integer.MIN_VALUE;
            int indx = -1;
            for (int j = 0; j <=i; j++) {
                if(arr[j] > max){
                    max= arr[j];
                    indx = j;
                }
            }
            // Swap arr[i] and arr[mindx]
            swap(arr, i ,indx);
        }
        print(arr);
    }

}
