public class ShippedWithInDays {
    public boolean isPossible(int[] weights, int days, int cap ){
        int load = 0, d = 1;// days we take
        for (int i = 0; i < weights.length; i++) {
            if(load + weights[i] <= cap) load += weights[i];
            else{
                load = weights[i];
                d++;
            }
        }
        if(d> days) return false;
        return true;

    }
    public int shipWithinDays(int[] weights, int days) {
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            mx = Math.max(weights[i],mx);
            sum += weights[i];
        }
        int mincap = sum;
        int lo =mx , hi = sum;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(weights,days, mid)){
                mincap = mid;
                hi =mid-1;
            }
            else lo =mid +1;
        }
        return mincap;

    }
}
