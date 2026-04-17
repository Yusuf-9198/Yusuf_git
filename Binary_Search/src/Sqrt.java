public int mySqrt(int n) {
    long low = 0 , high = n;
    while(low<=high){
        long mid = (high - low)/2 + low;
        if(mid*mid == (long)n){
            return (int)mid;
        } else if (mid*mid > (long) n) { high = mid -1;
        }else low = mid + 1;
    }
    return (int)high;

}
// good approach
/*
public int mySqrt(int n) {
    if(n == 0) return 0;
    if(n == 1) return 1;
    int low = 0 , high = n;
    while(low<=high){
        int mid = (high - low)/2 + low;
        if(mid == n/mid){
            return mid;
        } else if (mid >  n/mid) { high = mid -1;
        }else low = mid + 1;
    }
    return high;
}
*/

void main() {
    System.out.print("Enter Number :- ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(mySqrt(n));


}