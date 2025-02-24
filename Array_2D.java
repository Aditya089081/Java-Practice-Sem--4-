import java.util.Scanner;
public class Array_2D {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] arr = new int[row][column];
        System.out.print("Enter matrix: ");
        for(int i =0;i<row;i++){
            for(int j =0;j<column;j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for(int i =0;i<row;i++){
            for(int j =0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        input.close();
    }
}
