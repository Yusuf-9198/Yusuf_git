package Arrays;

public class SearchingInTwoArray {
    public static boolean searchTarget(int[][] a,int x){
        int n=a.length;
        int m = a[0].length;
        // NOT EFFICIENT (NOT PREFERED)
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if(a[i][j]==x) return true;
        //     }
        // }
        // return false;

        // MORE EFFICIENT (PREFERED)
        int i=0,j=m-1;
        while(i<n && j >=0){
            if(a[i][j]==x) return true;
            if(a[i][j]<x) i++;
            else j--; 
            }
        return false;  
    } 
    public static void main(String[] args) {
        int[][] arr ={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        if(searchTarget(arr, 20)==true) System.out.println("found :)");
       else System.out.println(" not found :(");
    }
}