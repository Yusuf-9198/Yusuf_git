//WAP to calculate factorial of na number (non recursive )

package college;

import java.util.Scanner;

public class P2L2 {
    public static void main(String[] args) {
        System.out.print("Enter  a Number  :");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int fact=1;
        if(n==1 || n==0){
            System.out.println("Factorial of a given number is :"+1);
        }
        else {for(int i =1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of a given number is :"+fact);
    }
    System.out.println("This is my  first java programe ");
        System.out.println("║   Mohd Yusuf (2024BITE069)    ║");
}
    
}
