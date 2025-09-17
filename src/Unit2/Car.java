package Unit2;

public class Car {
    //Attributes
    String model;
    int year;
    static int counter; //This attribute belongs to the class Car, not to a single Car object

    //Constructor is a special method that creates an object usually by assigning values to attributes
    public Car (String m, int y) {
        model = m;
        year = y;
        counter++; //Adding each new instance of a Car class

    }
    public static void howManyCars() {
        System.out.println("We have " + counter + " cars");

    }

    public static void main(String[] args) {
        Car car1 = new Car ("Tesla", 2021); //counter +1
        Car car2 = new Car ("BMW", 2022); //counter +1
        Car car3 = new Car ("Mercedes", 1958); //counter +1
        Car.howManyCars();//Calling a static method from the class Car

        //According to the best principles of OOP, we should not access attributes and modify them directly as we did it in a Student class
        //student.name + "John" X
        //Instead, we have two options:
        //Either pass the name as a parameter like Student student = new Student ("John");
        //Or we can use a method setName(); that can modify our class attributes

        //Encapsulation - one of the most important OOP concepts
        //Classes must protect data from direct access, and it can be achieved by using access modifiers such as private, protected, public, or default


    }
}
