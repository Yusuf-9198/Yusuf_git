package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SprialArray {
    //METHODE ONE
    public static void spiral(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int minR = 0, minC = 0, maxR = row - 1, maxC = col - 1;
        while(minR<=maxR && minC<=maxC) {
            for (int j = minC; j <= maxC ; j++) {
                System.out.print(arr[minR][j] + " ");

            }
            minR++;
            if(minR>maxR || minC>maxC) break;
            for (int i = minR; i <= maxR; i++) {
                System.out.print(arr[i][maxC] + " ");

            }
            maxC--;
            if(minR>maxR || minC>maxC) break;

            for (int j = maxC; j >= minC ; j--) {
                System.out.print(arr[maxR][j] + " ");

            }
            maxR--;
            if(minR>maxR || minC>maxC) break;

            for (int i = maxR; i >= minR ; i--) {
                System.out.print(arr[i][minC] + " ");

            } 
            minC++;

        }

    }
    // METHOD TWO (ON LEETCODE)
    public static List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> num=new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;
        int minR = 0, minC = 0, maxR = row - 1, maxC = col - 1;
        while(minR<=maxR && minC<=maxC) {
            for (int j = minC; j <= maxC ; j++) {
                num.add(arr[minR][j]);
                

            }
            minR++;
            if(minR>maxR || minC>maxC) break;
            for (int i = minR; i <= maxR; i++) {
                num.add(arr[i][maxC]);
            }
            maxC--;
            if(minR>maxR || minC>maxC) break;

            for (int j = maxC; j >= minC ; j--) {
                num.add(arr[maxR][j]);

            }
            maxR--;
            if(minR>maxR || minC>maxC) break;
            for (int i = maxR; i >= minR ; i--) {
                num.add(arr[i][minC]);

            }
            minC++;
        }
        return num;
        
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 ,13}, { 5, 6, 7, 8,14 }, { 9, 10, 11, 12 ,15} };
        spiral(arr);
        System.out.println("");
        System.out.println(spiralOrder(arr));
    }

}
