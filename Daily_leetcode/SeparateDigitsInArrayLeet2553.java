import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SeparateDigitsInArrayLeet2553 {

    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = nums.length; i >= 0 ; i--) {
            while(nums[i] !=0){
                result.add(nums[i]%10);
                nums[i]/=10;
            }
        }
        Collections.reverse(result);
        // int[] primitiveArr = list.stream().mapToInt(i -> i).toArray();
        int[] answer = result.stream().mapToInt(i -> i).toArray();

        return answer;
    }

}
