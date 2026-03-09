package college;

public class RectangleP1L4 {
    private float length;
    private float breadth;
    public float calcArea(){
       
    return this.length*this.breadth;

    }
    public RectangleP1L4(float length,float breadth){
        this.length=length;
        this.breadth=breadth;

    }
    public static void main(String[] args) {
        RectangleP1L4 r1 = new RectangleP1L4(2.3f,4.5f);
        RectangleP1L4 r2 = new RectangleP1L4(6.7f,3.4f);
        System.out.println("Area of rectangle 1 is "+ r1.calcArea());
        System.out.println("Area of rectangle 2 is "+ r2.calcArea());
        
    }
    
}
