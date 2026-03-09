package college;
import java.util.Scanner;

// Custom exception for invalid login
class InvalidLoginException extends Exception {
    public InvalidLoginException(String msg) {
        super(msg);
    }
}

public class ExamPortal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Simulated username/password
        final String correctUser = "student";
        final String correctPass = "1234";
        int totalQuestions = 2;
        int answered = 0;

        try {
            // 1. Validate Login
            System.out.print("Enter username: ");
            String user = sc.next();
            System.out.print("Enter password: ");
            String pass = sc.next();
            if (!user.equals(correctUser) || !pass.equals(correctPass)) {
                throw new InvalidLoginException("Invalid login credentials!");
            }
            System.out.println("Login successful.");

            // 2. Simulate Question Answering (with NumberFormatException)
            for (int i = 1; i <= totalQuestions; i++) {
                System.out.print("Answer Q" + i + " (number): ");
                try {
                    int ans = Integer.parseInt(sc.next());
                    answered++;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number.");
                }
            }

            // 3. Exception if submit before answering all questions
            System.out.print("Submit exam? (yes/no): ");
            String submit = sc.next();
            if (submit.equalsIgnoreCase("yes") && answered < totalQuestions) {
                throw new Exception("Cannot submit before answering all questions!");
            } else if (submit.equalsIgnoreCase("yes")) {
                System.out.println("All answers submitted successfully.");
            }
        } catch (InvalidLoginException e) {
            System.out.println("Login Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exam Error: " + e.getMessage());
        } finally {
            // Uses finally to thank students and display status
            System.out.println("Thank you for participating. Check your submission status above.");
        }
    }
}
