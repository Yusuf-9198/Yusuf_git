public class SelectionSort {
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
        int[] arr = {10,-1,5,2,8,-6};
        print(arr);
        int n= arr.length;
        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < n; j++) {
                if(arr[j] < min){
                    min= arr[j];
                    mindx = j;
                }
            }
            // Swap arr[i] and arr[mindx]
            swap(arr, i ,mindx);
        }
        print(arr);
    }
}
