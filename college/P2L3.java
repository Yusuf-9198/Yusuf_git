//WAP THAT CALCULATE AND PRINT SLUTION OF QUDRATIC EQUATION


package college;

import java.util.Scanner;

public class P2L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// ax2 + bx + c=0
        System.out.println("Enter a :");
        int a = sc.nextInt();
         System.out.println("Enter b :");
        int b = sc.nextInt();
         System.out.println("Enter c :");
        int c = sc.nextInt();
        if(( b*b)- 4*a*c<0){
            System.out.println("complex roots");
            float dis= (float)(Math.sqrt(-( b*b)+ 4*a*c));
            
            char i='i';
            System.out.println("root1"+ ((-b+" +"+dis+"*i"+"/"+2*a)));
            System.out.println("root2"+ ((-b+" -"+dis+"*i"+"/"+2*a)));

        }else if(( b*b)- 4*a*c>=0){
            float ans1 = (float) ((-b+(Math.sqrt(( b*b)- 4*a*c)))/2*a);
            float ans2 = (float) ((-b-(Math.sqrt(( b*b)- 4*a*c)))/2*a);
            System.out.println("root 1 "+ans1);
            System.out.println("root 2 "+ans2);


        }
    }
    
}
