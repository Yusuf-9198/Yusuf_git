import java.util.Scanner;

public class Fabonacii {
    public int fib(int n) {
        int nth =0;
        if(n<=0) return n;
        else if(n==1) return 1;
        else{
            nth = fib(n-2) + fib(n-1);

        }
        return nth;
    }
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
        sc.close();
    }
    
}
