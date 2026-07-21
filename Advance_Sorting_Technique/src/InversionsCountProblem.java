public class InversionsCountProblem {
    static  int count =0;
    public static void merge(int[] a , int[] b, int[] c){
        int i =0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            }
            else {
                c[k]= b[j];
                j++;
            }
            k++;

        }
        while(i<a.length){
            c[k] = a[i];
            i++;k++;
        }

        while(j<b.length){
            c[k] = b[j];
            j++;k++;
        }


    }
    public static void inversionCount(int[] arr){
        int n = arr.length;
        if(n == 1) return;
        int[] a = new int[n/ 2];
        int[] b = new int[n-n/ 2];
        for (int i = 0; i < n / 2; i++) {
            a[i] = arr[i ];
        }
        for (int i = 0; i < n - n / 2; i++) {
            b[i] = arr[i + n/2];
        }
        inversionCount(a);
        inversionCount(b);
        // Count Inversion pairs
        invCount(a,b);
        merge(a,b,arr);

    }
    public static void invCount(int[] a , int[] b){
        int i =0 , j =0;
        while(i<a.length && j< b.length){
            if(a[i]> b[j]){
                count +=(a.length-i);
                j++;
            }
            else i++;
        }
    }
    static void main() {
        int[] a = {87,54,24,89,1,34,21};
        inversionCount(a);
        System.out.println(count);
    }

}
