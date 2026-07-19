public class MergeSortAlgo {
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
    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void mergeSort(int[] arr){
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
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);

    }

    static void main() {
        int[] a = {87,54,24,89,1,34,21};
        mergeSort(a);
        print(a);
    }
}
