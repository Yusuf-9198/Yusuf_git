public class UpdateSting {
    public static void main(String[] args) {
        String s = "yusufyusufyusuf";
        String str="";
        for (int i = 1; i < s.length(); i+=2) {
            str += " a"+s.charAt(i);
        }
        System.out.println(str);
    }
    
}
