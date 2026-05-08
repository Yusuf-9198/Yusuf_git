// public class StringTraversalRecursivly {
//     static void printString(String s , int indx){
//         if(indx == s.length() - 1 ){
//             if(s.charAt(indx) == 'a') return;
//             System.out.print(s.charAt(indx));
//         }
//         if(s.charAt(indx) != 'a') System.out.print(s.charAt(indx));
//         printString(s, indx + 1);
//     }
//     public static void main(String[] args) {
//         String s = "abaj duia";
//         printString(s, 0);
//     }
    
// }

import java.util.Scanner;

public class StringTraversalRecursivly
{
	static void printString(String s , int indx , char a){
        if(indx == s.length() - 1 ){
            if(s.charAt(indx) == a) return;
            System.out.print(s.charAt(indx));
        }
        if(s.charAt(indx) !=a) System.out.print(s.charAt(indx));
        printString(s, indx + 1,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char skip = sc.next().charAt(0);
        printString(s, 0,skip);
        sc.close();
    }
}
