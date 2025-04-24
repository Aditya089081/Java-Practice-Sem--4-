abstract class Vehicle{
    private String Name;
    private int fuel;
    public abstract void start();
    public String getter_name(){
        return this.Name;
    }
    public void setter_name(String name){
        this.Name = name;
    }
    public int getter_fuel(){
        return this.fuel;
    }
    public void setter_fuel(int Fuel){
        this.fuel += Fuel;
    }
}
class Car extends Vehicle{
    void add_fuel(int n){
        setter_fuel(n);
    }
    void add_name(String name){
        setter_name(name);
    }
    public void start(){
        System.out.println(this.getter_name()+" is starting.");
    }
}
class  Thar extends Vehicle{
    void add_fuel(int n){
        setter_fuel(n);
    }
    void add_name(String name){
        setter_name(name);
    }
    public void start(){
        System.out.println(this.getter_name()+" is driving.");
    }
}



public class Inheritance {
    public static void main(String [] arg){
        Car car = new Car();
        car.add_name("Car");
        car.add_fuel(5);
        Thar thar = new Thar();
        thar.add_name("Thar");
        thar.add_fuel(10);
        car.start();
        System.out.println(car.getter_name());
        System.out.println(car.getter_fuel());
        thar.start();
        System.out.println(thar.getter_name());
        thar.add_fuel(10);
        System.out.println(thar.getter_fuel());
    }
}
