package college;

interface IFunctionalInterface {
    void perform(int a, int b);
}

public class IFuncInterface {
    public static void main(String[] args) {
        int a = 2, b = 4;
        int c = 2, d = 4;
        int e = 2, f = 4;

        IFunctionalInterface sum = (x, y) -> System.out.println(x + y);
        IFunctionalInterface subtract = (x, y) -> System.out.println(x - y);
        IFunctionalInterface multiply = (x, y) -> System.out.println(x * y);

        sum.perform(a, b);        
        subtract.perform(c, d);   
        multiply.perform(e, f);   
    }
}

