public class QuickSortAlgo {
    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr , int lo , int hi){
        int pivote = arr[(lo + hi)/2], pInd = (lo + hi)/2;// pivote Index
        int smallCount = 0;
        for (int i = lo ; i <= hi; i++) {
            if(i== (lo + hi)/2) continue;
            if(arr[i]<=pivote) smallCount++;
        }
        int correctIndx = lo + smallCount;
        // swap
        swap(arr,pInd,correctIndx);
        // partition { left me smaller and right me larger }
        int i = lo , j = hi;
        while(i<correctIndx && j>correctIndx){
            if(arr[i]<=pivote) i++;
            else if(arr[j]>pivote) j--;
            else if (arr[i] > pivote && arr[j] <= pivote) {
                swap(arr,i,j);
                i++;j--;
            }
        }
        return correctIndx;
    }
    public static void quickSort(int[] nums, int lo , int hi){
        if(lo>=hi) return;
        int indx = partition(nums,lo,hi);
        quickSort(nums,lo,indx-1);
        quickSort(nums,indx +1,hi);

    }

    static void main() {
        int[] arr = {4,9,7,1,2,3,6,5,8};
        quickSort(arr,0,arr.length-1);
        for(int ele: arr){
            System.out.print(ele+ " ");
        }
    }
}
