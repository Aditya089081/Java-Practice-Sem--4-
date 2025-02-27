
// 
// 
// Create a program using for loop multiplication table for a number.
// 
// Create a program using for-each to find the maximum value in an integer array.
// 
// Create a program using break to read inputs from the user in a loop and break
// the loop if a specific keyword (like "exit") is entered.
// Create a program using continue to sum all positive numbers entered by the
// user; skip any negative numbers.
// Create a program using continue to print only even numbers using continue for
// odd numbers.
// Create a program using recursion to display the Fibonacci series upto a certain
// number.
// 













// import java.util.Scanner;
public class Practice_5 {
    // 1.  Create a program using do-while to find password checker until a valid
// password is entered.
// public static void main(String[] arg){
//     Scanner input = new Scanner(System.in);
//     int password;
//     do{
//         password = input.nextInt();
//     }while(password!=1234);
//     System.out.println("Correct Password Entered.");
//     input.close();
// }

    // 2.  Create a program using dæwhile to implement a number guessing game.

    // public static void main(String[] arg){
    //     Scanner input = new Scanner(System.in);
    //     // int num;
    //     do{
    //         System.out.println((int)(Math.random()*1000));
    //     }while(false);
    //     input.close();
    // }

    // 4.  Create a program using for to display if a number is prime or not.
    // static int checkPrime(int num){
    //     if(num ==1 || num == 0 || num == 2){
    //         return 1;
    //     }else{
    //         for(int i =2;i*i<=num;i++){
    //             if(num%i==0){
    //                 return 0;
    //             }
    //         }
    //     }
    //     return 1;
    // }
    // public static void main(String[] arg){
    //     // double a = 34.4994949;
    //     // System.out.println(String.format("%.3d",a));

    //     System.out.println(checkPrime(4));
    // }

    // 5. Create a program using for-each to the occurrences of a specific element in an
// array.

    // public static void main(String[] arg){
    //     int arr[] = {1,2,3,4,5,6,7,8};
    //     int arr1[] = new int[arr.length];
    //     // for(int num: arr){
    //     //     int temp = num;
    //     //     int i=1;
    //     //     num =-1;
    //     //     for(int num1 : arr){
    //     //         if(temp == num1 ){
    //     //             num1=-1;
    //     //             i++;
    //     //         }
    //     //     }
    //     //     arr1[temp] = i;
    //     // }
    //     // for(int i=0;i<arr.length;i++){
    //     //     System.out.println(arr1[i]);
    //     // }
    //     for(int i =0;i<arr.length;i++){
    //         if(arr[i]==-1){
    //             continue;
    //         }
    //         // int total = 1;
    //         arr1[arr[i]]++;
    //         for(int j =i+1;j<arr.length;j++){
    //             if(arr[i]==arr[j]){
    //                 arr1[arr[i]]++;
    //                 arr[j] = -1;
    //             }
    //         }
    //     }
    //     for(int i =0;i<arr.length;i++){
    //         System.out.println(arr1[i]);
    //     }
    // }

    // public static void main(String [] arg){
    //     int arr[]={1,2,3,4,1,2,3,4,1,2,3,4,1};
    //     int max = 1000;
    //     int arr1[] = new int[max+1];
    //     for(int i =0;i<arr.length;i++){
    //         arr1[arr[i]]++;
    //     }
    //     for(int i =0;i<arr1.length;i++){
    //         if(arr1[i]!=0){
    //             System.out.println(arr1[i]);
    //         }
    //     }
    // }


    // 62.  Create a program usiag recursion to check if a stciag is a PaIindrome using— recursion.

    // static int stringPalindrome(String str,int index,int len){
    //     if(index>=len) return 1;
    //     if(str.charAt(index)!=str.charAt(len)){
    //         return 0;
    //     }
        
    //     return stringPalindrome(str,index++,len--);
    // }
    // public static void main(String[] arg){
    //     System.out.println(stringPalindrome("madam",0,"madam".length()-1));
    // }

}
