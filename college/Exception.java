package college;

import java.util.Scanner;

public class Exception {
    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numner 1 ");
        int x = sc.nextInt();
        System.out.println("enter numner 2 ");
        int y = sc.nextInt();

        try {
            double result = div(x, y);

        } catch (ArithmeticException e) {
            System.out.print("cannot be divide by Zero ");
        }

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        try {
            int[] arr = new int[3];
            int val = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        
    }

}
