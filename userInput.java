// import java.util.Scanner;
// public class userInput {
//     public static void main(String[] arg){
//         Scanner scanner = new Scanner(System.in); //creating object(instance)
//         System.out.print("Enter value: ");
//         int age = scanner.nextInt(); 
//         System.out.println("Age is: "+age);
//     }

// }
                        // Create a program that asks the user for their
                        //  name, age, and favorite color, then displays
                        //   a user profile with this information
// import java.util.Scanner;
// class Q1{
//     public static void main(String[] arg){
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter age: ");
//         int age = input.nextInt();
//         input.nextLine();
//         System.out.print("Enter name: ");
//         String Name = input.nextLine();
//         System.out.print("Enter favourite color: ");
//         String color = input.nextLine();
//         System.out.println("\n"+"Name: "+Name+"\n"+"Age: "+age+"\n"+"favourite color: "+color);
//     }
// }

/*   Error ---> Then, it asks for the name using nextLine(), but nextLine()
 is skipped because nextInt() does not consume the newline character (\n)
  left in the input buffer.
The next nextLine() call, which is supposed to take the favorite color,
 actually captures the leftover newline from the previous input instead of waiting for user input.
As a result, the name input is skipped, and only the favorite color is correctly read.


How to Fix?
You need to consume the newline character left by nextInt() before calling nextLine(). Add an extra input.nextLine(); after reading age.
 */


// class input{
//     public static void main(){
        
//     }
// }