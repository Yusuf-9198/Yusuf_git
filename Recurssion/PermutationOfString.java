import java.util.ArrayList;

public class PermutationOfString {
    ArrayList<String> permuStrings = new ArrayList<>();
    void permutation(String s1 , String s){
        if(s.isEmpty()){
            permuStrings.add(s1);
            return;
        }
        for (int i = 0; i <s.length(); i++) {
            // String s2 = s1 + s.charAt(i);
            // String s3 = s.substring(0,i) + s.substring(i+1); // left part + right part
            // permutation(s2, s3);
            // //or we can directly call the function without creating new variable
            permutation(s1 + s.charAt(i), s.substring(0,i) + s.substring(i+1)) ;
        }
    }
    public void main(String[] args) {
        String s = "abc";
        permutation("", s);
        System.out.println(permuStrings);
        
    }
    
}
