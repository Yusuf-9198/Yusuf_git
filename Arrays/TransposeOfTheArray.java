package Arrays;

public class TransposeOfTheArray {
    public static void swap(int x, int y){
        int temp =x;
        x=y;
        y = temp;
    }
    public static void main(String[] args) {
    // Scanner sc =new Scanner(System.in);
    // System.out.print("Enter number of rows :");
    // int n=sc.nextInt();
    // System.out.print("Enter number of cloumn :");
    // int m=sc.nextInt();
    // int[][] arr= new int[n][m];
    // int[][] arr2= new int[m][n];
    int[][] arr= {{1,2,3},{4,5,6}};
    int n= arr.length;
    int m = arr[0].length;
    int[][] arr2= new int[m][n];

    // System.out.println("Enter Arrays elements: ");

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            // arr[i][j]=sc.nextInt();
            arr2[j][i]=arr[i][j];
            
            
        }
        
    }
    swap(n,m);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            arr2[i][j]=arr[i][j];
        }
        System.out.println(" ");
       
    }
    
    }
}
