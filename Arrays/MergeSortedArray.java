package Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr = { 10, 40, 56, 68 };
        int[] arr2 = { 20, 31, 46, 69,70, 71 };
        int n2 = arr2.length;
        int n1 = arr.length;
        int[] merarr = new int[n1 + n2];
        // BY THREE POINTER METHOD 1 ({[not perfer]}) :
        // int i=0,j=0,k=0;
        // while(k<n1+n2){
        // if(arr[i]<=arr2[j]){
        // merarr[k]=arr[i];
        // merarr[++k]=arr2[j];
        // i++;j++;k++;
        // }else{
        // merarr[k]=arr2[i];
        // merarr[++k]=arr[j];
        // i++;j++;k++;
        // }
        // }

        // this code is prefered:
        // int i = 0, j = 0, k = 0;
        // while (i < n1 && j < n2) {
        //     if (arr[i] <= arr2[j]) {
        //         merarr[k] = arr[i];
        //         i++;
        //         k++;
        //         // }else if(i>=n1 || j>= n2){
        //         // break;
        //     } else {
        //         merarr[k] = arr2[j];
        //         j++;
        //         k++;
        //     }
        // }
        // if (i == n1) {// now take only elemnets from arr2
        //     while (j < n2) {
        //         merarr[k] = arr2[j];
        //         j++;
        //         k++;
        //     }
        // } else {// if arr2 extaust first take elments only from arr;
        //     while (i < n1) {
        //         merarr[k] = arr[i];
        //         i++;
        //         k++;
        //     }
        // }

        /* also done different methods  like take i=n1, j=n2 and k=n1+2
         * and run code in reverse oreder [ try karo ...]
         */
        int i = n1-1, j = n2-1, k = n1+n2-1;
        while (i >=0 && j >=0) {
            if (arr[i] >= arr2[j]) {
                merarr[k] = arr[i];
                i--;
                k--;
                // }else if(i>=n1 || j>= n2){
                // break;
            } else {
                merarr[k] = arr2[j];
                j--;
                k--;
            }
        }
        if (j< 0) {// now take only elemnets from arr2
            
              while(k>-1) { merarr[k] = arr[i];
                i--;
                k--;}
           
        } else if (i<0) {// if arr2 extaust first take elments only from arr;
            while ( k>-1) {
                merarr[k] = arr2[j];
                j--;
                k--;
            }
        }

        for (int ele : merarr) {
            System.out.print(ele + " ");
        }

}
}
