import java.util.HashSet;

public class BasicSets {
    static void main() {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(6);
        set.add(61);
        set.add(-66);
        // operations
        System.out.println(set );
        // convert into Array
        Object[] arr = set.toArray();
        Integer[] arr1 = set.toArray(new Integer[0]);
        int[] arr3 = set.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(arr1[i]);
            System.out.print(arr3[i]);
        }
        for(int ele : set){
            System.out.print(ele + "  ");
        }


    }
}
