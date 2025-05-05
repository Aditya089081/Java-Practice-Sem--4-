public class Exceptions extends Exception {
    public static void main(String [] arg){
        int a = 0;
        try{
            a = 10/0;
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Finally Executed.");
        }
        assert a!=0 : "Devisor cannot be zero";
        try{
            if(a==0){
                throw new Exception("Error");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
