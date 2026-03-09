package Arrays;
public class LeedcodeTest {
    public  static int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            int[] ans = new int[2];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j && (nums[i] + nums[j] == target)) {
                        ans[0] = j;
                        ans[1] = i;
                    } 
                    

                }
            }
            return ans;

        }
    
    public static void main(String[] args) {
        int[] arr={2,4,5,67,8};
        int k=6;
        int[] arr1= twoSum(arr , k);
        System.out.println(arr1[0]+" "+arr1[1]); 
       

       
        
    }

    

}
