import java.util.Scanner;
// Create a class Book with:
// Instance variables titte, author, and price.
// A constructor that initializes all fields using the this keyword.
// Write a method printDetaits() to display the book information.
class Book{
    // Instance Variable.
    // Data Memeber.
    public String tittle;
    public String author;
    public int price;
    Book(String tittle,String author,int price){
        this.tittle = tittle;
        this.author = author;
        this.price = price;
    }
    // Member function.
    public void printDetail(){
        System.out.println("Book information:\nTittle: "+this.tittle+".\nAuthor: "+this.author+".\nPrice: "+this.price+".");
    }
}
public class This {
    public static void main(String[] arg){
        System.out.println("Eneter Book information: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Tittle: ");
        String tittle = input.nextLine();
        System.out.print("Author: ");
        String author = input.nextLine();
        System.out.print("Price: ");
        int price = input.nextInt();

        Book info = new Book(tittle,author,price);
        info.printDetail();
        input.close();
    }
}
