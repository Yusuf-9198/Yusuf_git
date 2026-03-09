package Daily_leetcode;

public class finalValueAfterOperations {
    public int finalValueAfterOper(String[] arr) {
        int x = 0;
        for (String arr1 : arr) {
            if ("++X".equals(arr1)) {
                ++x;
            } else if ("X++".equals(arr1)) {
                x++;
            } else if ("--X".equals(arr1)) {
                --x;
            } else {
                x--;
            }
        }
        return x;

    }

}
