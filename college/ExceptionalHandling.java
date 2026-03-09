package college;
import java.util.Scanner;
public class ExceptionalHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int b= sc.nextInt();
        try{
            double c = a/b;
            System.out.println("Division of number1 and number2 is  :"+c);
        }
        catch(ArithmeticException e){
            System.out.println("Erorr : cannot divided by zero !");
        }

        sc.close();
    }
}
