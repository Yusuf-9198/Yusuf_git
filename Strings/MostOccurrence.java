package Strings;
// given a string consist of lowercase english alphabate .
// print the character that is occuring thr most number of times.
public class MostOccurrence {
     void mostOccurens(String s){
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[(char)(s.charAt(i)) -'a']++;
        }

        int maxfreq = -1;
        for (int i = 0; i < 26; i++) {
            maxfreq=Math.max(maxfreq,freq[i]);
        }
         for (int i = 0; i < 26; i++) {
             if(maxfreq == freq[i] ) {
                 char m = (char)(i+97);
                 System.out.println(m);
             }
         }

    }
    public static void main(String[] args) {
         MostOccurrence m = new MostOccurrence();
        String name = "yyususff";
        m.mostOccurens(name);

    }
}
