package Arrays;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayList {
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(10);a.add(20);a.add(30);
        List<Integer> b=new ArrayList<>();
        b.add(40);b.add(50);
        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        d.add(70);
        List<List<Integer>> v=new ArrayList<>();
        v.add(a);v.add(b);v.add(c);v.add(d);
        //PRINT IN LIST FORM
        System.out.println(v+" ");
        // PRINT IN 2D FORM (GRIDE FORM )
        for (int i = 0; i < v.size(); i++) {
            List<Integer> x= v.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j)+" ");
                
            }
            System.out.println(" ");
            
        }



    }
    
}
