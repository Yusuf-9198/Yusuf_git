package college;

abstract class Phone {
    abstract void greetmsg();

    
}

public class Test2 {
    public static void main(String[] args) {
        Phone iphone = new Phone() {
            @Override
            void greetmsg() {
                System.out.println("Hello This is Iphone");
            }
        };
        
        iphone.greetmsg(); 
    }
}
