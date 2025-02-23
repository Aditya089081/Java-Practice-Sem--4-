public class Type_Casting {
    // byte --> short --> int --> long --> float --> double.
    public static void main(String[] arg){
        // Type conversion
            //  1. Widening - Implicit
        byte a = 23;
        int b = a;
        // No need to convert because int have bigger container 
        //  or take more bytes than byte
        short c = 23;
        b = c;
        System.out.println(b); 

            //  2. Explicit
        int d = 34;
        // short e = d; // error
        // System.out.println(e);
         
    }
}
