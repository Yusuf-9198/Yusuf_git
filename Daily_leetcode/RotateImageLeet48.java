public class RotateImageLeet48 {
    static void swap(int i , int j, int[][] arr){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;

    }

    public static void rotateImage(int[][] arr){
        // int n =arr.length;
        // int m = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                if(i!=j){swap(i, j, arr);}
                }
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j =0 ; j < arr[0].length; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[i][ arr[0].length - j];
                    arr[ i][arr[0].length -  j]= temp;
            }
        }
            
        

    }

    public static void main(String[] args) {
        int[][] arr = {}
    }

    
}