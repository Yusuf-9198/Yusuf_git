import static java.lang.Math.min;
// x => target
void main() {
    int[] arr = {2,9,10,11,61,98};
    int n = arr.length;
    int x = 9;
    int lo= 0 , hi = n-1;
    int ub = n;
    while(lo <= hi){
        int mid = (hi - lo)/2 + lo;
        if(arr[mid] > x){
            ub = min(ub, mid);
            hi = mid- 1;
        }
        else {
            lo = mid + 1;
        }
    }
    System.out.println(ub );

}