package college;

class Parent {
    String name = "Parent";

    void display() {
        System.out.println("Parent method");
    }

    
}

class Child extends Parent {
    String name = "Child";

    @Override
    void display() {
        System.out.println("Child method");
    }
    void fun(){
        System.out.println("hello");
    }
}

public class Main {
    public static void main(String[] args) {
        // Polymorphism (Parent reference, Child object)
        Parent obj1 = new Child();
        // Direct Child object
        Child obj2 = new Child();

        // Method calls (runtime polymorphism)
        obj1.display();  // Output: Child method
        obj1.fun();  
        obj2.display();  // Output: Child method
        ((Child) obj1).fun();

        // Field access (compile-time binding)
        System.out.println("obj1.name = " + obj1.name); // Output: Parent
        System.out.println("obj2.name = " + obj2.name); // Output: Child
    }
}
