
// Define a Student class with fields like name and age, and use
// toString to print student details.
// Concatenate and Convert: Take two strings, concatenate them,
// and convert the result to uppercase.
// Calculate the area and circumference of a circle for a given radius
// using Math.Pl
// Simulate a dice roll using Math.random() and display the outcome
// (1 to 6).
// Create a number guessing game where the program selects a
// random number, and the user has to guess it.
// Take an array of words and concatenate them into a single string
// using StringBuilder.
// Create an obfect with final fields and a constructor to initialize
// 76th Question --
class Student{
    public String Name;
    public int Age;
    

    public String toString(){
        return "Detail-->Name: "+this.Name+" Age: "+this.Age;
    }
}
public class Practice_10 {
    public static void main(String [] arg){

        Student aditya = new Student();
        aditya.Name = "Aditya";
        aditya.Age = 19;
        System.out.println(aditya.toString());
    }
}
