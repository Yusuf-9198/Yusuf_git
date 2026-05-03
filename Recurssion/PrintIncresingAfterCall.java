import java.util.Scanner;

public class PrintIncresingAfterCall {
    public static void printIncreasing(int n){
        if(n==0) return;
        printIncreasing(n-1); // after the call, we are printing the value of n, so it will print in increasing order
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Printing in increasing order:");
        printIncreasing(n);
        sc.close();
    }                       

    
}
