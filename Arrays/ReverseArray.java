package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 54, 67, 8, 8 };
        int n = arr.length;
        for (int i = 0; i <= (arr.length - 1) / 2; i++) {
            int tem = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = tem;

        }
        for (int ele : arr) {
            System.out.print(ele + " ");

        }
        System.out.println("\n");
        // by two pointer methode
        int i = 0, j = n - 1;// swap the array part from (i to j)
        while (i <= j) {
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
            i++;
            j--;

        }
        for (int ele : arr) {
            System.out.print(ele + " ");

        }

    }
}
