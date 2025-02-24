// Develop a program that prints the multiplication table for a given number.
// Create a program to sum all odd numbers from 1 to a specified number N.
// Write a function that calculates the factorial of a given number.
// Create a program that computes the sum of the digits of an integer.
// Create a program to find the Least Common Multiple (LCM) of two
// numbers.
// Create a program to find the Greatest Common Divisor (GCD) Of two
// integers.
// Create a program to check whether a given number is prime.
// Create a program to reverse the digits of a number.
// Create a program to print the Fibonacci series up to a certain number.
// Create a program that print patterns:
import java.util.Scanner;
public class Practice_2 {
    // 1. LCM of Numbers.
    public static void main(String[] arg){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter two number for LCM: ");
            int a = input.nextInt();
            int b = input.nextInt();
            int num = 1;
            while(a%2==0 || b%2==0){
                    if(a%2==0 && b%2==0){
                            a/=2;
                            b/=2;
                            num*=2;
                        }
                        else if(a%2==0){
                                a/=2;
                                num*=2;
                            }
                            else{
                                    b/=2;
                                    num*=2;
                                }
                            }
                            while(a%3==0 || b%3==0){
                                    if(a%3==0 && b%3==0){
                a/=3;
                b/=3;
                num*=3;
            }
            else if(a%3==0){
                    a/=3;
                    num*=3;
                }
                else{
                        b/=3;
                        num*=3;
                    }
                }
                while(a%5==0 || b%5==0){
                        if(a%5==0 && b%5==0){
                                a/=5;
                                b/=5;
                                num*=5;
                            }
                            else if(a%5==0){
                                    a/=5;
                                    num*=5;
                                }
                                else{
                                        b/=5;
                                        num*=5;
                                    }
                        }
                        System.out.println(num);
                        input.close();
                    }
                    
    // 2. Create a program to check if a number is an Armstrong number.
    // -->Armstrong number = sum_of((each_element)^length_of_number)
    // public static void main(String []arg){
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter number: ");
    //     int num = input.nextInt();
    //     int sum = 0;
    //     int temp = num;
    //     int digit = String.valueOf(num).length();
    //     while(temp>0){
    //             int rem = temp%10;
    //             sum+=Math.pow(rem,digit);
    //             temp/=10;
    //         }
    //         if(sum == num){
    //                 System.out.println("Armstrong NUmber.");
    //             }
    //             else{
    //                     System.out.println("Not Armstrong Number.");
    //                 }
    //                 input.close();
    //             }
                                    
    // 3. Create a program to verify if a number is a palindrome.
    // public static void main(String []arg){
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter number: ");
    //     int num = input.nextInt();
    //     int sum = 0;
    //     int temp = num;
    //     while(temp>0){
    //         sum*=10;
    //         int rem = temp%10;
    //         sum+=rem;
    //         temp/=10;
    //     }
    //     if(sum == num){
    //         System.out.println("Palindrome.");
    //     }
    //     else{
    //         System.out.println("Not Palindrome.");
    //     }
    // }
}