public class BubbleSort {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] arr){
        // 01. worst case with O(n*n)
//        int n= arr.length;
//        for (int k = 0; k < n-1; k++) {
//            for (int i = 0; i < n - 1; i++) {
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }
        // 02. little More Optimise then previous
//        int n= arr.length;
//        for (int k = 0; k < n-1; k++) {
//            for (int i = 0; i < n - 1 - k ; i++) {
//                if(arr[i]>arr[i+1]){
//                    int temp = arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }

        // 03. further more optimize
        int n= arr.length;
        for (int k = 0; k < n-1; k++) {
        boolean flag = true; // check if this pass has sorted or not
            for (int i = 0; i < n - 1 - k ; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
        if(flag==true) break;
        }
    }
    static void main(String[] arg) {
        int[] arr = {9,5,-6,8,2,6};
        print(arr);
        bubbleSort(arr);

        print(arr); 
    }
}
