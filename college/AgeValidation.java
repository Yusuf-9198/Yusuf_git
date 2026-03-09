package college;

import java.util.*;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class AgeValidation {
    static void ageValidator(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age less than 18 not allowed!");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            ageValidator(age);
        } catch ( InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
