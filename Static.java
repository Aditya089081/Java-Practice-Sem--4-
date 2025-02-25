public class Static {
// Create a class Library with:
// A static variable totalBooks.
// Instance variables for bookName and isAvailable.
// A static method getTotalBooks() that returns the total number of books in the library.

    static int totalBooks;
    public String bookName;
    public boolean isAvailaible;

    static int getTotalBooks(){
        return totalBooks;
    }

    public static void main(String[] arg){
        Static.totalBooks = 25;
        Static s1 = new Static();
        s1.bookName = "Journey is Adventerous.";
        s1.isAvailaible = true;

        System.out.println("No. of Books Availaible: "+getTotalBooks());
        System.out.println("Available: "+s1.isAvailaible);
    }
}
