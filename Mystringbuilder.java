// import java.util.Scanner;

class Mystringbuilder{
    static String rev(StringBuilder sb){
        return sb.reverse().toString();
    }
    // String unique(String nam){
        
    // }
    static String uniq(String a){
        char[] arr = a.toCharArray();
        String ret = "";
        for(int i =0;i<arr.length;i++){
            Boolean check = true;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    check = false;
                    break;
                }
            }
            if(check){
                ret+=arr[i];
            }
        }
        return ret;
    }
    public static void main(String[] arg){
        // Scanner input = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder(input.nextLine());
        // System.out.print(sb);
        // String a = "ynnus ";
        
        // StringBuilder sb = new StringBuilder("ynnus");
        // sb.insert(2,"234");
        // sb.replace(1,4,"Aditya");
        // System.out.println(rev(sb));
        // char[] arr = a.toCharArray();
        // String a1 = "Hey Programmign is fun";
        // a1=a1.toLowerCase();
        // char[] arr = a1.toCharArray();
        // int v = 0;
        // int con =0;
        // for(char b:arr){
        //     if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'){
        //         v++;
        //     }else if(b==' '){
        //         continue;
        //     }else{
        //         con++;
        //     }
        //     System.out.println(b);
        // }
        // System.out.println(v+" "+con);
        // String a = "Aditya";
        // a = a.toLowerCase();
        // char[] arr = a.toCharArray();
        // for(int j = 0;j<a.length();j++){
        //     Boolean check = true;
        //     for(int i =j+1;i<a.length();i++){
        //         if(arr[i]==arr[j]){
        //             check = false;
        //             break;
        //         }
        //     }
        //     if(check){
        //         System.out.println(arr[j]);
        //     }
        // }
        // String b = a.replace("ya","23455555");
        //         System.out.println(b);
        // System.out.println(uniq("AdityA"));








        // input.close();
    }
}