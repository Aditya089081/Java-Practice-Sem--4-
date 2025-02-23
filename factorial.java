import java.util.Scanner;
// Factorial Using static meathods
public class factorial{
    public static int factorial_1(int num){
        if(num == 1){
            return 1;
        }
        return num*factorial_1(num-1);
    }
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value: ");
        int a = input.nextInt();
        // System.out.println("a: "+a);
        int fact = factorial_1(a);
        System.out.println("factorial of "+a+": "+fact);
        input.close();
    }
}