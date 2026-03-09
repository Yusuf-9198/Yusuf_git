package Arrays;

public class SetMatricsZero {
    public static void setZero(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        // int[][] arr1 =new int[n][m];
        // for (int i = 0; i < n; i++) {//coping array
        // for (int j = 0; j < m; j++) {
        // arr1[i][j]=arr[i][j];
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // if(arr[i][j]==0 && arr1[i][j]==0){
        // for (int i2 = 0; i2 < n; i2++) {
        // arr[i2][j]=0;
        // }
        // for (int j2 = 0; j2 < m; j2++) {
        // arr[i][j2]=0;
        // }
        // }
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(arr[i][j]+" ");
        // }
        // }
        // }
        // public static void main(String[] args) {
        // int[][] arr ={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        // setZero(arr);}

        // still not as good as we want
        // boolean[] a = new boolean[n];
        // boolean[] b = new boolean[m];
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) { // MARKING THE PARTICULAR ROW AND COL
        // if (arr[i][j] == 0) {
        // a[i] = true;
        // b[j] = true;
        // }
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // if (a[i]) {
        // for (int j = 0; j < m; j++) {
        // arr[i][j] = 0;
        // }
        // }
        // }
        // for (int j = 0; j < m; j++) {
        // if (b[j]) {
        // for (int i = 0; i < n; i++) {
        // arr[i][j] = 0;
        // }
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // }

        boolean zerorow = false;
        boolean zerocol = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 0)
                zerocol = true;
            break;
        }
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[0][j] == 0)
                zerorow = true;
            break;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }

            }

        }
        for (int i = 1; i < n; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < m; j++) {
                    arr[i][j] = 0;

                }
            }

        }
        for (int j = 1; j < m; j++) {
            if (arr[0][j] == 0) {
                for (int i = 1; i < n; i++) {
                    arr[i][j] = 0;

                }
            }

        }
        if (zerorow == true) {// set the oth row zero
            for (int j = 0; j < arr[0].length; j++) {
                arr[0][j] = 0;

            }

        }
        if (zerocol == true) {// set the 0th col zero
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        int[][] arr2 = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZero(arr);
        System.out.println("");
        setZero(arr2);
    }

}
