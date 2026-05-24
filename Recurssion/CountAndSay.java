public class CountAndSay {

//    public String countSay(String s){
//        StringBuilder ans = new StringBuilder();
//        if(s == null || s.isEmpty()) return "";
//        int i = 0;
//        int count =1;
//        while(i<s.length()){
//            if( i == s.length()-1 || s.charAt(i) != s.charAt(i+1)) {
//                ans.append(count);
//                ans.append(s.charAt(i));
//                count = 1;
//            }else count++;
//            i++;
//        }
//        return ans.toString();
//    }

    // Leet 38(Hard)
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1);
//        String s = countAndSay(n-1) + "@";
// we use it,  if we don't have to write
//        ans += (j-i);
//        ans += s.charAt(i);
//        i=j;
// after loop
        //  now modify s
        String ans = "";
        int i=0,j=0;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j)) j++;
            else {
                ans += (j - i);
                ans += s.charAt(i);
                i = j;
            }
        }
        ans += (j-i);
        ans += s.charAt(i);
        i=j;
        return ans;
    }

    //Optimize Code
    /*
    public String countAndSay(int n) {
    if (n <= 0) return "";
    String res = "1";

    // Iteratively generate the sequence up to n
    for (int step = 1; step < n; step++) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        int len = res.length();

        while (j < len) {
            // Find the end of the current block of identical characters
            while (j < len && res.charAt(i) == res.charAt(j)) {
                j++;
            }
            // Append the count and the character
            sb.append(j - i);
            sb.append(res.charAt(i));
            // Move pointer i to the start of the next block
            i = j;
        }
        res = sb.toString();
    }

    return res;
}
    */

    void main() {
        String s= "4455886666";
        System.out.println(countAndSay(3));
    }
}
