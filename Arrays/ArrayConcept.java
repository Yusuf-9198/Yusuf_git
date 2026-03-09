package Arrays;

import java.util.Scanner;


public class ArrayConcept {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[5];
        System.out.println("Enter a array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++){
                if ((arr[i] + arr[j]) == x && i < j) {
                    System.out.println(arr[i] + " " + arr[j]);
                    break;

                }
            }

        }

    }
}
