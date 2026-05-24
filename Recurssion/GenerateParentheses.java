import java.util.ArrayList;
import java.util.List;

/*
n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
* */
public class GenerateParentheses {
    ArrayList<String> list = new ArrayList<>();

    public List<String> printParenthesis(int open , int close, int n, String s) {
        if(s.length() == 2*n) {
            list.add(s);
        }
        if(open<n) printParenthesis(open+1,close,n,s+"(");
        if(close < open) printParenthesis(open, close+1 ,n,s +")");
        return list;
    }
    public List<String> generateParenthesis(int n) {
        printParenthesis(0, 0 , n , "");
        return list;
    }
}
