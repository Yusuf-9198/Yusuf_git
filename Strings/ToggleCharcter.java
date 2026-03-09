package Strings;
import java.util.Scanner;

public class ToggleCharcter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        StringBuilder sb =new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
             int n = (int)ch;
            if (n>=65 && n <= 90) {
                n+=32;
                ch = (char)n;
                sb.setCharAt(i, ch);
            }
            else if(n>=97 && n<=122){
                n-=32;
                ch = (char)n;
                sb.setCharAt(i, ch);


            }
            
        }
        System.out.println(sb);
    }
    
}
