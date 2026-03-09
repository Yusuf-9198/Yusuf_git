package college;

import java.util.Scanner;

public class BankAccountP4L3 {
    private int AccountNum;
    private float balance;
    public void setbalance(float balance){
        this.balance=balance;

    }
    public float getbalance(){
        return balance;

    }
    public float withdraw( float mon){
         if((balance-mon)<0){
            System.out.println("not sufficient balance");
         }else{
            balance=balance - mon;
            System.out.println("Reamining balance: ");
         }
         return balance;

    }
    public float deposit(float money){
        return balance = balance+ money;

    }
    public static void main(String[] args) {
        System.out.println("Enter amoount :");
        Scanner sc = new Scanner(System.in);

    }
    
}
