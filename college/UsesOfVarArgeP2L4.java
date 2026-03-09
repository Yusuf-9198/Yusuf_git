package college;

// import java.util.Scanner;

public class UsesOfVarArgeP2L4 {
    public static int totalMarks(int... args){
        int totalMarks=0;
        for(int data : args) {
            totalMarks= totalMarks+data; 
        }
        return totalMarks;

    }
    public static void main(String[] args) {
        
        int totalmarks=totalMarks(97,67,56,78,89,67);
        
        System.out.println("total marks student get : "+ totalmarks);
        
    }
    
}
