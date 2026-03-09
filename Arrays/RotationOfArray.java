package Arrays;

public class RotationOfArray {
    public static void reverseArray(int[] x, int a, int b) {
        while(a<=b){
            int temp = x[a];
            x[a] = x[b];
            x[b] = temp;
            a++;
            b--;

        }
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");}
        System.out.println("\n");
        int n = arr.length;
        reverseArray(arr, 0, n - k - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }System.out.println("\n");
        reverseArray(arr, n - k, n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }System.out.println("\n");
        reverseArray(arr, 0, n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
