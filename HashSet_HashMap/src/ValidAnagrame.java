import java.util.HashMap;

public class ValidAnagrame {
    // leet 242
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(sMap.containsKey(ch)) sMap.put(ch, sMap.get(ch) +1);
            else sMap.put(ch,1);
            char ch1 = t.charAt(i);
            if(tMap.containsKey(ch1)) tMap.put(ch1, tMap.get(ch1) +1);
            else tMap.put(ch1,1);
        }

        for(Character key : sMap.keySet()){
            if(!tMap.containsKey(key)) return false;
            int val1 = sMap.get(key);

            int val2 = tMap.get(key);
            if(val1 != val2) return false;
        }
        return true;
    }
    // optimised
    /*public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
    }*/
}
