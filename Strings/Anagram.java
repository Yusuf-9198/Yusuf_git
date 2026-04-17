package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    // But not Optimise use hash map for optimization
    /*
    public boolean isAnagram(String s, String t){
        char[] arr1= s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)) return true;

        return false;
*/
        // much optimise

        public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int [] freq = new int[26];
        for (int i = 0;  i <  s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int count : freq){
            if(count !=0) return false;
        }
        return true;



    }

}
