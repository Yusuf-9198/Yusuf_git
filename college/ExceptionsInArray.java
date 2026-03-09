package college;

import java.util.Scanner;

public class ExceptionsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        try {
            System.out.print("Enter Numerator :");
            int num= sc.nextInt();
            System.out.print("Enter Denominator :");
            int deno= sc.nextInt();
            float result = num / deno;
            System.out.println("result => " + result);

            System.out.print("Enter Index in Array :");
            int ind =sc.nextInt();
            System.out.println("Value at index "+ind+" is "+arr[ind]);

            
        } catch (ArithmeticException e) {
            System.out.println("Arithemetic Exception :" + e.getMessage());
            
        }catch(ArrayIndexOutOfBoundsException d){
            System.out.println("Array Exception : "+ d.getMessage());
        }
        sc.close();
    }
    
}
