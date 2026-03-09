package Arrays;

public class  MatrixInWaveform {

    public static void firstToLast(int[][] arr, int m) {
        int n = arr[0].length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[m][i] + " ");

        }
        // System.out.println("");

    }

    public static void LastTofirst(int[][] arr, int m) {
        int n = arr[0].length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[m][i] + " ");

        }
        // System.out.println("");

    }

    public static void waveForm(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                firstToLast(arr, i);

            } else {
                LastTofirst(arr, i);
            }

        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, { 5, 6, 7,8}, { 9, 10,11,12}, {13, 14, 15, 16}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println(" ");
        }System.out.print(" ");
        waveForm(arr);

    }

}
