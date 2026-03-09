package Strings;

import java.util.Scanner;

public class PrintNumVowels{
    public static boolean isVowel(char ch) {
        if(ch=='a' || ch=='A') return true;
        if(ch=='e' || ch=='E') return true;
        if(ch=='i' || ch=='I') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='u' || ch=='U') return true;
        return false;
        
    }
    public static void main(String[] args) {
        System.out.print("Enter a String :");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
        //    if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'  ){
              if(isVowel(ch)){

            count++;

           }
        }
        System.out.println(count);
    }
}