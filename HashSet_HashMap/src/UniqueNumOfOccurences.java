import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;


public class UniqueNumOfOccurences {
    // Leet 1207
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else map.put(arr[i] , 1);
        }
        HashSet<Integer> set = new HashSet<>(map.values());

        return set.size() == map.size();

    }
}
