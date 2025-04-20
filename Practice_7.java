import java.util.Scanner;
class Book{
    String title;
    String author;
    String isbn;
    static int totalBooks;
    Book(){
        totalBooks=100;
    }
    void borrowBook(){
        System.out.println("Book is Borrowed");
        System.out.println("Book Name: "+this.title);
        System.out.println("Author is "+this.author);
        totalBooks--;
    }
    void returnBook(){
        System.out.println("Book is returned.");
        ++totalBooks;
    }
    static int getTotalBook(){
        return totalBooks;
    }

}

    
// Create a Book class for a library system.
// • Instance variables: title, author, isbn.
// • Static variable: totalBooks, a counter for the total number of book
// instances.
// • Instance methods: borrowBook(), returnBook().
// • Static method: getTotalBooks(), to get the total number of books in the
// library.







// Design a Course class.
// • Instance variables: courseName, enrolledStudents.
// • Static variable: maxCapacity, the maximum number of students for any
// course.
// • Instance methods: enrollStudent(String studentName),
// unenrollStudent(String studentName).
// • Static method: setMaxCapacity(int capacity), to set the maximum
// courses.
// class Course{
//     String courseName;
//     String enrolledStudent1;
//     static int maxCapicity;
//     String enrolledStudent(){
//         return this.enrolledStudent1;
//     }
//     String unenrolledStudent(){
//         return "You not Enrolled in any course.";
//     }
//     static int maxCapicity1(int cap){
//         Course.maxCapacity = cap;
//         return maxCapicity;
//     }
// }




public class Practice_7 {

    public static void main(String[] args) {
        System.out.println("Using main: ");
        Scanner input = new Scanner(System.in);
        Book buy = new Book();
        buy.title="How to make money";
        buy.author = "Sant Fhiskar William";
        buy.borrowBook();
        System.out.println(Book.getTotalBook());
        input.close();

    }

    // Course course = new Course();
    // course.courseName = "Java";
    // course.enrolledStudent1 = "Aditya";
    // System.out.println(Course.maxCapicity1(100));

}
