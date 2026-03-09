package Strings;

import java.util.Scanner;

public class PrintAllSubstrings {
    public static void Substrings(String str){
        System.out.println("substrings are :");
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.print(str.substring(i,j)+" ");
                count++;
                
            }
            
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        System.out.print("Enter a String :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Substrings(s);
    }
    
}
