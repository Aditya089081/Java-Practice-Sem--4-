// 53.
// 54.
// 
// 55.

// 56.
// 
// 57.

// 58.
// Create a program to create a simple calculator that uses a
// switch statement to perform basic arithmetic operations
// like addition, subtraction, multiplication, and division.

import java.util.Scanner;
public class Practice_4{
    // 1.  Create a program to find the minimum of two numbers.
    // public static void main(String []arg){
    //     System.out.println(Math.min(23,2));

    // }

    //  2. Create a program to find if the given number is even or odd.
    // public static void main(String[] arg){
    //     int a =23;
    //     System.out.println(a%2==0?"Even":"Odd");
    // }

    // 3. Create a program to calculate the absolute value of a given
// integer.

    // public static void main(String[] arg){
    //     System.out.println(Math.abs(-1234456));
    // }

    // 4. Create a program to Based on a student's score, categorize as
// "High", "Moderate", or "Low" using the ternary operator (e.g.,
// High for scores > 80, Moderate for 50-80, Low for < 50).

        // public static void main(String[] arg){
        //     int marks = 70;
        //     System.out.println(marks>80?"Topper":marks>40?"moderate":"Low");
        // }

        //  5. Create a program to print the month of the year based on a
// number (1-12) input by the user.

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        char months = input.next().charAt(0);
        String Months = switch(months){
            case '1' -> "January";
            case '2' -> "Febuary";
            default -> "Remaining";
        };
        System.out.println(Months);
        input.close();
    }
}