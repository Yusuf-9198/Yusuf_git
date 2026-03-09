package college;

import java.util.Scanner;

class Student2 extends PersonP1L5 {
    private final int studentId;

    public Student2(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    
    public String getRole() {
        return "Student";
    }

    public int getStudentId() {
        return studentId;
    }

    
    class Course {
        private String courseName;

        public Course(String courseName) {
            this.courseName = courseName;
        }

        public void printEnrollment() {
            
            System.out.println("Student " + name + " is enrolled in  course " + courseName);
        }
    }
}
class major{
     public static void main(String [] args ){
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your name : ");
    String name=sc.nextLine();
    System.out.println("Enter your ID and course name : ");
    int studentId =sc.nextInt();
    
    String courseName=sc.nextLine();
    Student2 s1= new Student2(name, studentId);
    Student2.Course c=s1.new Course(courseName);
    c.printEnrollment();
    
}

     
}
