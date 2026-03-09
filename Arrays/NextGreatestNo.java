package Arrays;

public class NextGreatestNo {
    public static void main(String[] args) {
        int[] a={12,60,41,37,2,49,16,28,21};
        int[] NextGN = new int[a.length];
        int n= a.length;
        NextGN[a.length-1]=-1;
        // method 1 : not perfered
        // for (int i = 0; i < a.length; i++) {
        //      int max=Integer.MIN_VALUE;
        //     for (int j = i+1; j < NextGN.length; j++) {
        //     max=Math.max(max,a[j]);
        //     }
        //     NextGN[i]=max;
        //     NextGN[a.length-1]=-1;
        // }

        //method 2: good
        int nge=a[n-1];
        for (int i = n-2; i >=0; i--) {
            NextGN[i]=nge;
            nge=Math.max(nge,a[i]);
            
        }
        for(int ele : NextGN){
            System.out.print(ele+" ");
        }
    }
    
}
