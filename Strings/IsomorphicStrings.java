package Strings;
// is Strings are isomorphic or not?
// Two strings s and t are isomorphic if the characters in s can be replaced to get t.
public class IsomorphicStrings {
    // According to time it is optimise but not by space
    /*public boolean isIsomorphic(String s, String t) {
        if(s.equals(t)) return true;
        char[] map = new char[128]; // '\0'
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            int idx = (int)sc;
            if(map[idx] == '\0') {
                map[idx] = tc;
            }else {
                if (map[idx] != tc) return false;
            }
        }
        for (int i = 0; i < 128; i++) {
            for (int j = 0; j < 128; j++) {
                if(map[i]!='\0' && map[j]!='\0' && i!= j && map[i] == map[j]) return false;
            }
        }
        return true;
    }*/
    // optimize by space

    public boolean isIsomorphic(String s, String t) {
        if(s.equals(t)) return true;
        char[] map = new char[128]; // '\0'
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            int idx = (int)sc;
            if(map[idx] == '\0') {
                map[idx] = tc;
            }else {
                if (map[idx] != tc) return false;
            }
        }
        for (int i = 0; i < 128; i++) {
            map[i] = '\0';
        }
        for (int i = 0; i < s.length(); i++) {
            char sc = t.charAt(i);
            char tc = s.charAt(i);
            int idx = (int)sc;
            if(map[idx] == '\0') {
                map[idx] = tc;
            }else {
                if (map[idx] != tc) return false;
            }
        }
        return true;


    }

}
