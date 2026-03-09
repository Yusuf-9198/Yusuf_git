package Strings;

import java.util.Scanner;

public class NumberOfDidgits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String inStr = num + "";
        System.out.println("number of digits " + inStr.length());

        // using inbuilt function
        String s = Integer.toString(num);
        System.out.println("number of digits " + s.length());

    }

}
