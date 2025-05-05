class Class{
    int tnum;
    
    int display(){
        final class start{
            void display(int n){
                tnum = n;
                System.out.println("Started"+tnum);
            }
        }
        start s = new start();
        // s.tnum = 23;
        s.display(6);
        return tnum;
    }
}
public class LocalClass {
    public static void main(String[] args) {
        Class c = new Class();
        int n = c.display();
        System.out.println(n);
    }
}
