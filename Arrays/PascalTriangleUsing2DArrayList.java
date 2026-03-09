package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleUsing2DArrayList {
    public static  List<List<Integer>> pascalTriangle(int n){
        List<List<Integer>> ans =new ArrayList<>();
        

        for (int i = 0; i <n ; i++) {
        List<Integer> l =new ArrayList<>();

        for (int j = 0; j <= i; j++) {
            l.add(1);
            
        }
        ans.add(l);   
        }
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= i-1; j++) {
                ans.get(i).set(j,(ans.get(i-1).get(j))+(ans.get(i-1).get(j-1)));
                
            }
            
        }
        return ans;

    }
    //MORE OPTIMISE ANSWER
    public static  List<List<Integer>> pascalsTriangle(int n){
        List<List<Integer>> ans =new ArrayList<>();
        

        for (int i = 0; i <n ; i++) {
        List<Integer> l1 =new ArrayList<>();

        for (int j = 0; j <=i; j++) {
            if(j==0 || j==i) l1.add(1);
            else l1.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));

          
        }
        ans.add(l1);   
        }
        
        return ans;

    }
    public static void main(String[] args) {
         List<List<Integer>> triangle = pascalTriangle(5);
         System.out.println(triangle);
    
 }
    
}
