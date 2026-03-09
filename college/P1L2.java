//WAP to print fibonaci series upto n terms


package college;

import java.util.Scanner;

public class P1L2 {
    public static void main(String[] args) {
        System.out.print("Enter Number of terms you want :");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int s=0,t=1 ,m;
        if(n==1) {
            System.out.println("Febonacci series");
            System.out.println(s);}
        else if(n==2){
            System.out.println("Febonacci series");
            System.out.println(s);
            System.out.println(t);}

        else{
            System.out.println("Febonacci series");
            System.out.println(s);
            System.out.println(t);
            for(int i =3;i<=n;i++){
                m=s+t;
                s=t;
                t=m;
                
                System.out.println(m);

            }

        }

    }
    
    
}
