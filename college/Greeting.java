package college;

interface Greet {
    void sayHello();
}

public class Greeting {
    public static void main(String[] args) {
        Greet g = new Greet() {
            public void sayHello() {
                System.out.println("Hello from anonymous inner class!");
            }
        };
        g.sayHello();
    }
}
