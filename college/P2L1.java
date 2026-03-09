//To calculate Tax as per given rules 
//<250000 - o%
//250000- 500000- 5%
//500000- 1000000- 20%
//>1000000 - 30%
package college;

import java.util.Scanner;

public class P2L1 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your Income :");
            int income = scan.nextInt();
            if(income<=250000)
                System.out.println("Your Tax is Zero(0)");
            else if(250000<income && income<=500000){
                int tax= (5*(income - 250000)/100);
                System.out.println("Your Tax is  "+ tax);
            }else if(500000<income && income<=1000000){
                int tax= (5*( 250000)/100)+(20*(income - 500000)/100);
                System.out.println("Your Tax is  "+ tax);
            }else{
                int tax=(5*(250000)/100)+(20*(500000)/100)+ 30*(income - 1000000)/100;
                System.out.println("Your Tax is  "+ tax);
            }
             System.out.println("This is my  first java programe ");
        System.out.println("║   Mohd Yusuf (2024BITE069)    ║");

            
    }
    
}
}
