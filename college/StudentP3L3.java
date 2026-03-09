//create a class student that keep track of the number of objects created

package college;

public class StudentP3L3 {
    static int count = 0;
    public StudentP3L3() {
        count++;
    }
    public static int getObjectCount() {
        return count;
    }
    public static void main(String[] args) {
        StudentP3L3 s1 = new StudentP3L3();
        StudentP3L3 s2 = new StudentP3L3();
        StudentP3L3 s3 = new StudentP3L3();
        StudentP3L3 s4 = new StudentP3L3();
        System.out.println("Number of Student objects created: " + StudentP3L3.getObjectCount());
    }
}

    
