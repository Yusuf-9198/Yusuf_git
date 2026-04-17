package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("yusuf");
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();

//        sb.deleteCharAt(2);
//        sb.delete(2,4 );
        sb.setCharAt(1,'o');
        System.out.println(sb);
//        sb.insert(1,'o');
        System.out.println(sb);

    }
}
