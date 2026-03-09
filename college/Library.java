package college;

class Library {
    private String bookTitle;
    private String studentName;
    static int totalBooksIssued = 0;

    public Library(String bookTitle, String studentName) {
        this.bookTitle = bookTitle;
        this.studentName = studentName;
        totalBooksIssued++;
    }

    public void display() {
        System.out.println("Book Title: " + bookTitle + ", Issued to: " + studentName);
    }

    public static void displayTotal() {
        System.out.println("Total number of books issued: " + totalBooksIssued);
    }
}
class Minor{
     public static void main(String[] args) {
        Library b1 = new Library("Java", "Ali");
        Library b2 = new Library("Math", "yusuf");
        b1.display();
        b2.display();
        Library.displayTotal();
    }
}

