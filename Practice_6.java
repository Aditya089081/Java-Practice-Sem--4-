import java.util.Scanner;
public class Practice_6 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Eneter n: ");
        int n = input.nextInt();
        int arr[]= new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter element: ");
        int a = input.nextInt();
        // int count = 0;
        // for(int i =0;i<n;i++){
        //     if(arr[i]==a){
        //         count++;
        //     }
        // }
        // System.out.println("Occurrence: "+count);

        arr=array(arr,a);
        for(int i =0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
        input.close();
    }

    static int[] array(int arr[],int n){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==n){
                for(int j = i+1;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        return arr;
    }
}
