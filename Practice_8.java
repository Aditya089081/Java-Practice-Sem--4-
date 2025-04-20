// Create a program to find the minimum of two numbers.
// 53.
// Create a program to find if the given number is even or odd.
// 54.
// Create a program to calculate the absolute value of a given
// integer.
// 55.
// Create a program to Based on a student's score, categorize as
// 56.
// "High", "Moderate", or "Low" using the ternary operator (e.g.,
// High for scores > 80, Moderate for 50-80, Low for < 50).
// 57. Create a program to print the month of the year based on a
// number (1-12) input by the user.
// Create a program to create a simple calculator that uses a
// 58.
// switch statement to perform basic arithmetic operations
// like addition, subtraction, multiplication, and division.


import java.lang.Math;
public class Practice_8 {
    public static void main(String []args){
        int min = Math.min(12,23);
        System.out.println(min);
        // System.out.println(12%2==0?"Even":"Odd");
        // System.out.println(Math.abs(-122));

        // System.out.println(51>80?"High":51>50?"Medium":"Low");
        int day = 2;
        String Months = switch(day){
            case 1->"January";
            case 2->"Febuary";
            case 3->"March";
            default->"Dont Know";
        };
        System.out.println(Months);
    }
    
}
