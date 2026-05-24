import java.util.HashSet;

// Leet 2744
//You are given a 0-indexed array words consisting of distinct strings.
public class MaxNumOfStringPairs {
    String reverseStr(String s){
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        s= s1.toString();
        return s;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(set.contains(reverseStr(words[i]))){
                count++;

            }
            else{
                set.add(words[i]);
            }
        }
        return count;
    }
//    You are given a 0-indexed array words consisting of strings.
String rev(String s){
    StringBuilder s1 = new StringBuilder(s);
    s1.reverse();
    s= s1.toString();
    return s;
}
    public int maximumNumOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(set.contains(rev(words[i]))){
                count++;
                set.remove(rev(words[i]));
            }
            else{
                set.add(words[i]);
            }
        }
        return count;
    }

    void main() {
        String[] arr = {"cd", "ac" , "dc" , "ca" , "tu"};
        String[] arr2 = {"cd", "ac" , "dc" , "ca" ,"dc", "tu"};
        System.out.println(maximumNumberOfStringPairs(arr));
        System.out.println(maximumNumOfStringPairs(arr2));
    }
}
