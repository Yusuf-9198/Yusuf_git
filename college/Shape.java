package college;

public class Shape {
    double area(double radius) {
        return Math.PI * radius * radius;
    }
    double area(double length, double width) {
        return length * width;
    }
}

class Triangle extends Shape {
    double area(double base, double height) {
        return 0.5 * base * height;
    }
}

class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("Circle: " + s.area(2));
        System.out.println("Rectangle: " + s.area(2,3));

        Triangle t = new Triangle();
        System.out.println("Triangle: " + t.area(3,4));
    }
}
