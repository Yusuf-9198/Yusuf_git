public class ArrayTraversalRecursivly {
    static void printArray(int[] arr, int indx){
        if(indx == arr.length-1){
            System.out.print(arr[indx]);
            return;
        }
        System.out.print(arr[indx] + " ");
        printArray(arr, indx + 1);
    }
    public static void main(String[] args) {
        int[] arr ={6,2,5,3,4,6,7};
        printArray(arr, 0);

    }
    
}
