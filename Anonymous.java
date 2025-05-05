interface Animal{
    void display();
}
class Anonymous{
    public static void main(String [] arg){
        Animal ani = new Animal(){
            public void display(){
                System.out.println("Displayed");

            }
        };
        ani.display();
    }
}