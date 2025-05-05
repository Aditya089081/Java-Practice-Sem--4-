interface Papa{
    void display();
    void setName(String Name);
    String getName();
}
abstract class Parent{
    String name;
    void display(){
        System.out.println("Parent is Working fine");
    }
}

class Child1 extends Parent{
    Child1(String Name){
        super.display();
        this.name = Name;
    }
    void display(){
        System.out.println("Child is also working Fine");
    }
}

class Child2 extends Parent{
    Child2(String Name){
        // super.display();
        // this.name = Name;
    }
}
public class InPoly {
    public static void main(String [] arg){
        Child1 a = new Child1("Aditya");
        Child2 a1 = new Child2("Aditya");
        System.out.println(a instanceof Child1);
        System.out.println(a1.equals(a));
    }
}
