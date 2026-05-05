/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
*/
public class RotateStringLeet796{
      // Approach 1: Brute Force (not efficient)
    // public boolean rotateString(String s, String goal) {
    //     int sLen = s.length();
    //     if(s.equals(goal)) return true;
    //     while(sLen >= 0){
    //         s = s.substring(1) + s.charAt(0);
    //         if(s.equals(goal)) return true;
    //         sLen--;
    //     }
    //     return false;
    // }

     // optimal approach: Concatenate s with itself and check if goal is a substring of the concatenated string
    // public boolean rotateString(String s, String goal) {
    //     if(s.length() != goal.length()) return false;
    //     s= s+s;
    //     if(s.indexOf(goal) != -1) return true;
    //     return false;
    // }

    // Best Approach: 
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
}