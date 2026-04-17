package Strings;
// we are using 2 pointer techquic
// "a,a,a,d,d,d,d,f,f,f,f" => a3d4f4
public class CompressedString {
    public static void main() {
        String s= "aaaaaasssssssssffwwwygggMMMM";
        char[] arr= s.toCharArray();
        String ans = "";
        int i=0, j=0;
        while (j< arr.length){
            if (arr[i] == arr[j]) j++;
            else{
                ans += arr[i];
                if((j-i)>1) ans += j-i;
                i=j;
            }
        }
        // for last iteration
        ans += arr[i];
        if((j-i)>1) ans += j-i;
        System.out.println(ans);
    }
}

/*
// Optimise Solution:-

public class CompressedString {
     int compress(char[] chars) {
        int i=0;
        int index=0;
        while(i<chars.length){
            int count=0;
            char current=chars[i];
            while(i<chars.length && current==chars[i]){
                count++;
                i++;
            }
            chars[index++]=current;
            if(count>1){
                String cnt=String.valueOf(count);
                for(char ch:cnt.toCharArray()){
                    chars[index++]=ch;
                }
            }
        }
        return index;
    }
    public void main() {
        String s= "aaaaaasssssssssffwwwygggMMMM";
        char[] arr= s.toCharArray();
        int ans = compress(arr);
        System.out.println(ans);
        }
}*/

