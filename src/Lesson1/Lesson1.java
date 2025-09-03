package Lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        //How to print in Java
        //There are two functions: println() and print()

        System.out.println("Welcome to APCSA!");
        System.out.println("Let's code some Java!");
        System.out.print("We can also use print() to print!");
        System.out.print("However, it won't move to the next line.");

        System.out.println();
        //Variables and Types
        //100 + 256 = ?
        System.out.println(100 + 256);
        //println() method only shows the output
        //it does not store any values

        int x; //variable declaration
        //Java creates the variable and gives it a default value
        //for now, x = 0
        x = 100;
        int y = 256;//compound assignment and declaration
        //try to create variable z
        //and assign a sum of x and y to it
        int z = x + y;
        System.out.println(z);

        //Double Type
        double var1 = 0.3;
        double var2 = var1 * 1.73;
        System.out.println(var2);

        double var3 = 9.0 / 3.0;
        System.out.println(var3);

        //Boolean Type
        boolean a = true;//true or false

        boolean b = 100 > 500;
        System.out.println(b);

        //First Simple Algorithm

        int age = 15;
        if(age > 14) {
            //if age > 14, returns true
            System.out.println("You can join our club");
        } else {
            //if age < 14, returns false
            System.out.println("You can't join our club");
        }
        //String Type - It is a reference type in Java that is used to represent text
    }
}
//Notes:
//Class: (a) A module or program that can contain executable code.
//(b) A description (template) of a type of objects. (Animal class, Human class, Employee class, Car class)
//Statement: An executable piece of code that represents a complete command to the computer.
//Method (Function): A named sequence of statements that can be executed together to perform a particular action or computation.
//Every executable Java program consists of a class, called the driver class.
//A logic error is a mistake in the algorithm or program that causes it to behave incorrectly or unexpectedly. These errors are detected by testing the program with specific data to see if it produces the expected outcome.
//A run-time error is a mistake in the program that occurs during the execution of a program. Run-time errors typically cause the program to terminate abnormally.