import java.util.Scanner;
public class Armstrong {
    // 2. Create a program to check if a number is an Armstrong number.
    // -->Armstrong number = sum_of((each_element)^length_of_number)
    public static void main(String []arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int sum = 0;
        int temp = num;
        int digit = String.valueOf(num).length();
        while(temp>0){
                int rem = temp%10;
                sum+=Math.pow(rem,digit);
                temp/=10;
            }
            if(sum == num){
                    System.out.println("Armstrong NUmber.");
                }
                else{
                        System.out.println("Not Armstrong Number.");
                    }
                    input.close();
                }
}
