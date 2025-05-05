public class nestedInner {
    protected String Name;
    void display(){
        System.out.println("Parent class displayed.");
    }
    public static class Inner{
        void display(String name){
            // Name = name;
            System.out.println("Inner class displayed. "+name);
        }
    }
    public static void main(String [] arg){
        // nestedInner ni = new nestedInner();
        nestedInner.Inner in = new nestedInner.Inner();
        in.display("Aditya ");
    }
}

