// import java.lang.Math;
// import java.util.Scanner;
import java.util.Arrays;
public class Practice_9 {
   
// Create a program using do-while to find password checker until a valid
// password is entered.
// Create a program using do-while to implement a number guessing game.
// Create a program using for loop multiplication table for a number.
// Create a program using for to display if a number is prime or not.
// Create a program using for-each to find the maximum value in an integer array.
     // Create a program using for-each to the occurrences of a specific element in an
// array.
     // Create a program using break to read inputs from the user in a loop and break
// the loop if a specific keyword (like "exit") is entered.
// Create a program using continue to sum all positive numbers entered by the
// user; skip any negative numbers.
// Create a program using continue to print only even numbers using continue for
// odd numbers.
      // Create a program using recursion to display the Fibonacci series upto a certain
// number.
       // S.a.......ü.eat.e..a..aogcam..usiag...cecursian..mcheckif...a..striog..isa.ælindromeusing-...—
// rson / 1 1 • 7.Programming Challenge 59-69 for details

    // public static void main(String [] arg){
    //     Scanner input = new Scanner(System.in);
    //     int pass;
    //     do{
    //         System.out.print("Enter the password");
    //         pass = input.nextInt();
    //     }while(pass != 1234);
    //     input.close();
    // }

    public static void main(String [] arg){
        int[] arr = new int[]{1,2,3,4,1,21,1,2};
        // int n = 8;
        int arr1[]=new int[8];
        Arrays.fill(arr,0);
        int count = 0;
        int i =-1;
        int j =0;
        for(int num: arr){
            i++;
            count = 0;
            j = 0;
            if(num==-1){
                continue;
            }
            for(int num1 : arr){
                j++;
                if(num==num1){
                    count++;
                    arr[j]=-1;
                }
            }
            arr1[i]=count;
        }
        System.out.println(Arrays.toString(arr1));
    }

}
