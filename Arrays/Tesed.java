package Arrays;

import java.util.*;

public class Tesed {
    /* package whatever; // don't place package name! */

    /* Name of the class has to be "Main" only if the class is public. */

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }   
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }   
        }
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max=Math.max(max,arr[i][j]);
            }   
        }
        System.out.println(max);
    }
        
    
    
    }
