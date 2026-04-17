public class InsertionSortAlgo {
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
        // Insertion Sort
        for (int i = 1; i < n ; i++) {
            for (int j = i; j >= 1; j--) {
                if(arr[j] < arr[j-1]){
                    swap( arr, j,j-1);
                }
                else break;
            }
        }
        // 2nd Form
//        for (int i = 1; i < n ; i++) {
//            int j =i;
//            while(j>=1 && arr[j] < arr[j-1]){
//                swap( arr, j,j-1);
//                j--;
//            }
//        }
        print(arr);
    }
}
