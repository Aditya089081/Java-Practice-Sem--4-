import java.util.Scanner;
// Create a program to find the sum and average of all elements in an
// array.
// Create a program to find number of occurrences of an element in an
// array.
// Create a program to find the maximum and minimum element in an
// array.
// Create a program to check if the given array is sorted.(Write a function that returns true if array is sorted in ascending order, else return false.)
//
// Create a program to check is the array is palindrome or not.
//
// Create a program to merge two sorted arrays.
//
// Create a program to search an element in a 2-D array.
//

// 1.  Create a program to find the sum of two diagonal elements.
public class Practice_3 {
    // public static void main(String[] arg){
        //     // int row = 2;
        //     // int column = 2;
        //     int[][] arr  ={{1,2},{4,5}};
        //     int sum =0;
        //     for(int i =0;i<arr.length;i++){
            //         for(int j = 0;j<arr[i].length;j++){
                //             if(i == j){
                    //                 sum+=arr[i][j];
                    //             }
                    //         }
                    //     }
                    //     System.out.println("Sum of digonals: "+sum);
                    //     // input.close();
                    // }
                    
    // 2. Create a program to do sum and average of all elements in a 2-D ar
    // public static void main(String[] arg){
        //          int[][] arr  ={{1,2},{4,5}};
        //         int sum =0;
        //         for(int i =0;i<arr.length;i++){
            //             sum = 0;
            //             for(int j = 0;j<arr[i].length;j++){
                //                 sum+=arr[i][j];
                //             }
                //             System.out.println("Sum of digonals: "+sum);
                //         }
        // }
                                
                                
    // 3. Create a program to reverse an array in same array.

    // public static void swap(int num1,int num2){
    //     int c = num1;
    //     num1 = num2;
    //     num2 = c;
    // }
    // public static void main(String []arg){
    //     // int size = 5;
    //     int[] arr = {1,2,3,4,5};
    //     for(int i =0;i<=arr.length/2;i++){
    //         int temp = arr[i];
    //         arr[i] = arr[arr.length-1-i];
    //         arr[arr.length-1-i] = temp;
    //     }
    //     for(int i =0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }

    // 4. Create a program to return a new array deleting a specific element.
    public static void main(String[] arg){
        int[] arr = {1,2,3,4,5};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for deleting: ");
        int num = input.nextInt();
        for(int i =0;i<arr.length;i++){
            if(arr[i] == num){
                for(int j = i;j<arr.length-1;j++){
                    arr[j] = arr[j+1];
                }
                // arr[arr.length-1] =0;
                break;
            }
        }
        
        for(int i =0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
