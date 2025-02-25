public class Practice_1 {
    // static int[] Xharcount(String name, char b){
        // for(int i )
        // int[] a;
        // return a;
    // }
    public static void odd_even(int a){
        if((a&1)==0){
            System.out.println("given number is even number.");
        }else{
            System.out.println("given number is odd number.");
        }
    }
    public static void main(String[] arg){
        // if u do bitwise and of even number with 1 then 0 will be obtained.
        int a = 10;
        int b = 1;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(a>>1);
        odd_even(25);
    }
}
