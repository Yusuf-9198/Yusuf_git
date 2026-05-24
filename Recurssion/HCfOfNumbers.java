public class HCfOfNumbers {
    public static int hcf(int a, int b){
//        for (int i = Math.min(a,b); i >=1 ; i--) { // TC = O(min(a,b))
//            System.out.println("time");
//            if(a%i==0 && b%i==0) return i;
//        }
//        return 1;

        // Optimise loop
//        int remainder =b%a;
//        while(remainder!=0){
//            b = a;
//            a = remainder;
//            remainder = b%a;
//        }
//        return a;

        // recursive
        if(b%a == 0) return a;
        return hcf(b%a,a);
    }
     public static void main(String[] args){
         int a= 41;
         int b=90;
         System.out.println(hcf(a,b));
     }
}
