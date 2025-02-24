import java.util.Scanner;
public class Array {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array: ");
        for(int i =0;i<size;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Array: ");
        for(int i =0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
