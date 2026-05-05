import java.util.Scanner;

public class StairPath {
    public int stair(int n){
        if(n<=2) return n;
        return (stair(n-1) + stair(n-2));
        
    }
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(stair(n));
        sc.close();
    }
}
