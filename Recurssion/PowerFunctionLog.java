public class PowerFunctionLog {
    public static int power(int x, int n){
        if(n==0) return 1;
        int halfPower = power(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        if(n%2==0) return halfPowerSq;
        else return x*halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(x, n));
    }           
    
}
