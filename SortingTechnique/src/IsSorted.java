public class IsSorted{
    static void main() {
        int[] arr = {1,25,5,8,4,2,3};
        int n = arr.length;
        boolean flag = true; // true means sorted
        for (int i = 0; i < n - 1; i++) {
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag==true) System.out.println("sorted");
        else System.out.println("unsorted");
    }
}