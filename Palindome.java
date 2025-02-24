import java.util.Scanner;
public class Palindome{
    // 3. Create a program to verify if a number is a palindrome.
    public static void main(String []arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int sum = 0;
        int temp = num;
        while(temp>0){
            sum*=10;
            int rem = temp%10;
            sum+=rem;
            temp/=10;
        }
        if(sum == num){
            System.out.println("Palindrome.");
        }
        else{
            System.out.println("Not Palindrome.");
        }
        input.close();
    }
}
