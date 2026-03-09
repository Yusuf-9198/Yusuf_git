package college;

public class StudentP3L4 {
    private String name;
    private int[] marks;

    // Correct constructor (no return type)
    public StudentP3L4(String name) {
        this.name = name;
        this.marks = new int[0];
    }

    // Correct constructor (no return type)
    public StudentP3L4(String name, int[] marks) {
        this.name = name;
        this.marks = marks != null ? marks.clone() : new int[0];
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int[] getmarks() {
        return marks.clone();
    }

    public void setmarks(int[] marks) {
        this.marks = marks != null ? marks.clone() : new int[0];
    }

    public double calcAvg() {
        if(marks.length == 0) return 0.0;
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i]; 
        }
        double avgmarks = (double) sum / marks.length;
        return avgmarks;
    }
    public static void main(String[] args) {
        int[] marks1 = {80, 90, 75};
        int[] marks2 = {88, 92, 81, 77};

        StudentP3L4 s1 = new StudentP3L4("Ali", marks1);
        StudentP3L4 s2 = new StudentP3L4("Fatima", marks2);
        StudentP3L4 s3 = new StudentP3L4("Zaid"); // No marks

        System.out.println("Student: " + s1.getname() + ", Avg Marks: " + s1.calcAvg());
        System.out.println("Student: " + s2.getname() + ", Avg Marks: " + s2.calcAvg());
        System.out.println("Student: " + s3.getname() + ", Avg Marks: " + s3.calcAvg());
    }
}
