
import java.util.Arrays;

// builtin sort
 class BuiltInSort {
    static void main(String[] args) {
        int[] arr = {9,5,-6,8,2,6};
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        Arrays.sort(arr); // BuiltIn Sort
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}
