package college;

interface  MultipleInhertence {
    void a();
    void b();
    void c();
}
interface  I2 {
    void d();
    
}
class Inhertence implements MultipleInhertence ,I2{
    public void d() {
        System.out.println("method d");
        
    }
    public void a() {
        System.out.println("method a");

        
    }
    public void b() {
        System.out.println("method b");
        
    }
    public void c() {
        System.out.println("method c");
        
    }

}
public class Major{
    public static void main(String[] args) {
        Inhertence H =new Inhertence();
        H.a();
        H.b();
        H.d();

    }

}
