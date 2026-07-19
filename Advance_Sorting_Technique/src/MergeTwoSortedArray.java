public class MergeTwoSortedArray {
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

    static void main() {
        int[] a = {1,5,9,56,87};
        int[] b = {54,59,222,458};
        int[] c = new int[a.length + b.length];
        merge(a,b,c);
        for(int ele : c){
            System.out.print(ele + " ");
        }

    }
}
