package Arrays;

public class SortColors {
    public static void swap(int[] A,int x,int y){
        int temp = A[x];
        A[x]= A[y];
        A[y]=temp;
        
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 2, 1, 2, 0, 0, 2, 1, 1, 0 };
        int n=arr.length;
        // BY TWO PASS SOLUTION : 
        // int noz = 0, no1 = 0, no2 = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == 0) {
        //         noz++;
        //     } else if (arr[i] == 1) {
        //         no1++;
        //     } else {
        //         no2++;
        //     }
        // }
        // for (int i = 0; i < noz; i++) {
        //     arr[i] = 0;
        // }
        // for (int i = noz; i < noz + no1; i++) {
        //     arr[i] = 1;
        // }
        // for (int i = noz + no1; i < arr.length; i++) {
        //     arr[i] = 2;
        // }
        // for (int ele : arr) {
        //     System.out.print(ele + " ");
        // }

    //BY ONE PASS SOLUTION (DUTCH FLAG ALGORITHM):
    int low=0;
    int mid= 0;
    int hig= n-1;
    for (int i = 0; mid <= hig; i++) {// also done //while(mid<=hig){}
        if(arr[mid]==0){
            swap( arr,low,mid);
            low++;
            mid++;
        }
        else if(arr[mid]==1){
            mid++;
        }
        else if(arr[mid]==2){
            swap(arr ,mid,hig);
            hig--;
        }

        
    }
    for (int ele : arr) {
            System.out.print(ele + " ");
         }
    }
}



