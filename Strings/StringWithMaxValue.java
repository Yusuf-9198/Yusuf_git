package Strings;
// given n string consisting of digit 0-9. return the string which has max value
// the numbers are Positive only
public class StringWithMaxValue {
    // String pass by value hoti hai
    public static String purify(String s){
        //"0078" -> "78"
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '0') return s.substring(i);
        }
        return s;
    }
    public static String max(String a , String b){
        String s = purify(a);
        String t = purify(b);
        if(s.length()>t.length()) return s;
        if(s.length()<t.length()) return t;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length()>= b.length()) return a;
        else return b;
    }

    public static void main() {
        // ye bade Integer pr kaam nhi karege
//        String[] num = {"455", "5866", "8966"};
//        int mx = Integer.MIN_VALUE;
//        for (String s : num) {
//            int n = Integer.parseInt(s);
//            mx = Math.max(mx, n);
//        }
//        System.out.println(mx);

        String[] num1 = {"004555555", "58866", "8966"};
        String maxS = num1[0] ;
        for (String p : num1) {
            maxS= max(maxS,p);
        }
        System.out.println(maxS);



    }
}
