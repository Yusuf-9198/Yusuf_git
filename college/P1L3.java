//WAP TO PRINT HALF INVERTED PYRAMID 
package college;

import java.util.Scanner;

public class P1L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int rows = sc.nextInt(); 
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
