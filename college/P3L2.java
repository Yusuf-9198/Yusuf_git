//WAP to calculate factorial of na number ( recursive )


package college;
import java.util.Scanner;
public class P3L2 {
    public int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1); 
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        P3L2 object = new P3L2(); 
        System.out.println("Factorial of a given number is :" + object.fact(n)); // Correct print
        System.out.println("This is my  first java programe ");
        System.out.println("║   Mohd Yusuf (2024BITE069)    ║");
    }

}

