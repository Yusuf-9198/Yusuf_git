public class BubbleSortReverse {

        public static void print(int[] arr){
            for(int ele : arr){
                IO.print(ele + " ");
            }
            IO.println();
        }
        public static void bubbleSortReverse(int[] arr){
            int n= arr.length;
            for (int k = 0; k < n-1; k++) {
                boolean flag = true; // check if this pass has sorted or not
                for (int i = 0; i < n - 1 - k ; i++) {
                    if(arr[i]<arr[i+1]){
                        int temp = arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1] = temp;
                        flag = false;
                    }
                }
                if(flag==true) break;
            }
        }
        public static void main(String[] arg) {
            int[] arr = {9,5,-6,8,2,6};
            print(arr);
            bubbleSortReverse(arr);

            print(arr);
        }
    }

