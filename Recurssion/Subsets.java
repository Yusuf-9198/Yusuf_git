import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static ArrayList<String> list = new ArrayList<>();
     void stringSubsets(String s, String s1,int indx){
        if(indx == s.length()){
            list.add(s1);
            return;
        }
        stringSubsets(s,s1,indx + 1); // not Take 
        stringSubsets( s,s1 + s.charAt(indx),indx + 1); // Take
    }

    // For Array Leet 78

   List<List<Integer>> result = new ArrayList<>();
    public void subsets(int[] arr) {
        result.clear();
        helper(0, arr, new ArrayList<>());
    }
    public void helper(int i, int[] arr, ArrayList<Integer> current) {
        if (i == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        helper(i + 1, arr, current);
        current.add(arr[i]);
        helper(i + 1, arr, current);
        current.removeLast();
    }    
    public  void main(String[] args) {
        String s = "abcd";
        stringSubsets(s, "", 0);
        // System.out.println(list);
        int[] arr = {1,2,3};
        subsets(arr);
        System.out.println(result );

    }

    
}
