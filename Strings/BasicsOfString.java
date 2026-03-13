package Strings;

public class BasicsOfString {
    public static void main(String[] args) {
        // String str = "yusuf beig";
        // System.out.println(str.charAt(4));
        // System.out.println(str.length());
  
        // String s1 = "beig";
        // String s2 = "mohd";
        // System.out.println(s1.compareTo(s2)); // -11 (b(98) - m(109))
        // System.out.println(s2.compareTo(s1)); // 11 (m(109) - b(98))
         


        
        // + Operator
        String  s1 = "abc";
        String  s2 = "def";
        s1 = s1 + s2;
        System.out.println(s1 + 10 + 20 ); // abcdef1020
        System.out.println(10 + 20 +s1); // 30abcdef 
        String s3=10 + "";  // this is used to convert integer to String **
         System.out.println(s3);

    }
    
}
