import java.util.Scanner;
public class Switch {
    //  1. Normal Switch Cases.

    // public static void main(String[] arg){
    //     Scanner input = new Scanner(System.in);
    //     int a = input.nextInt();
    //     if(a<=10){
    //         switch(a){
    //             case 1:
    //             System.out.println("Value is 1.");
    //             break;
    //             case 2:
    //             System.out.println("Value is 2.");
    //             break;
    //             default:
    //             System.out.println("Not Defined.");
    //         }
    //     }else if(a>=10){
    //         a = a%10;
    //         switch(a){
    //             case 1:
    //             System.out.println("Value is 1.");
    //             break;
    //             case 2:
    //             System.out.println("Value is 2.");
    //             break;
    //             default:
    //             System.out.println("Not Defined.");
    //         }
    //     }
    //     input.close();
    // }

    // 2. Modified Switch Cases.
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int solution = switch(num){
            case 2 -> 344;
            case 3 -> 67;
            case 4 -> 78;
            default -> 89;
        };
        System.out.println(solution);
        input.close();
    }
    // public static void main(String[] arg){
        // Scanner input = new Scanner(System.in);
        // String name = input.nextLine();
        // String a = "Aditya Tiwari";
        // String[] name1 = {"Aditya Tiwari"};
        // System.out.println(name1[0]);
        

    // }
}
