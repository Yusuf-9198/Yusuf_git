import java.util.Scanner;

int maze01(int m, int n) { // (m,n) -> (1,1)
    if (m == 1 || n == 1)
        return 1;
    return maze01(m - 1, n) + maze01(m, n - 1);
}
// in another way
int maze(int row , int col,int m, int n) { // (1,1)-> (m.n)
    if(row==m || col == n) return 1;
    // int rightway = maze(row, col +1, m, n);
    // int downway = maze(row+1, col, m, n);
    return maze(row, col +1, m, n)+maze(row+1, col, m, n);
}

void main() {
    Scanner sc = new Scanner(System.in);
    IO.print("ENter n :-");
    int n = sc.nextInt();
    IO.print("ENter n :-");
    int m = sc.nextInt();
    IO.println(maze(1,1,m, n));
    IO.println(maze01(m, n));
    sc.close();

}
