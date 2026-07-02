import java.util.HashMap;
import java.util.HashSet;

/*
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Note that "bca" and "cab" are also correct answers
*/
public class _LongestSubstringWithoutRepeat {
    // 2 pointer Approach(sliding window)
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1) return 1;
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j=0;
        int maxlen = 0;
        while(j<s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch) && map.get(ch) >=i){
                int l = j-i;
                maxlen= Math.max(maxlen,l);
                while(s.charAt(i)!= ch) i++;
                i++;
            }
            map.put(ch,j);
            j++ ;
        }
        int l = j-i;
        maxlen= Math.max(maxlen,l);
        return maxlen;

    }
}
