package Arrays;

public class MultiplicationOfMatrices {
    public static void multipli(int[][] a, int[][] b) {
        int r = a.length;
        int s = a[0].length;
        int t = b.length;
        int u = b[0].length;
        int[][] ans = new int[r][u];
        if (s == t) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < u; j++) {
                    int sum = 0;
                    for (int k = 0; k < s; k++) {
                        sum += a[i][k] * b[k][j];
                    }
                    ans[i][j] = sum;
                }
            }
            for (int[] an : ans) {
                for (int j = 0; j < ans[0].length; j++) {
                    System.out.print(an[j] + " ");
                }
                System.out.println(" ");
            }
        } else
            System.err.println("Mutilplication Not Possible");

    }

    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2 ,1}, { 2, 1 ,2} };
        int[][] arr2 = { { 1, 0, 1, 2 }, { 2, 1, 0, 0 }, { 0, 3, 1, 1 } };
        multipli(arr1, arr2);
    }

}
