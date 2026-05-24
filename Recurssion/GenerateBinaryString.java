// generate all binary string of length n without consecutive 1's
public class GenerateBinaryString {
    public static void bs(int n,String s){
        if(s.length() == n) {
            System.out.print(s + " ");
            return;
        }
//
        bs(n,s+"0");
        if(s.isEmpty() || s.charAt(s.length() - 1) == '0' ){
            bs(n,s+"1");
        }

    }

    static void main() {
        int n = 5;
        bs(n,"");
    }

}
// 00000 00001 00010 00100 00101 01000 01001 01010 10000 10001 10010 10100 10101
// 00000 00001 00010 00100 00101 01000 01001 01010 10000 10001 10010 10100 10101
