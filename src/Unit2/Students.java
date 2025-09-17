package Unit2;

public class Students {
    //Attributes are class variables responsible for storing data in objects
    //Defines what properties the objects will have
    private String name; //private makes it unaccessible by attempts of any direct modifications
    private int age;
    private String id;

    //private locks the access to this data from any other classes
    //public allows access from any other classes

    //Constructor

    //Behavior or methods
    //Defines what objects can take
    public void printStudentInfo() {
        System.out.println(name + ", " + age + ", " + id);
    }
    public static void printWelcomingMessage(String studentName) {
        System.out.println(studentName + ", " + "welcome to our school!");
    }

    public static void main(String[] args) {
        //Create the variable student
        //Type name = new Type
        Students student1 = new Students(); //This is a real object that lives in RAM
        student1.name = "John";
        student1.id = "214a";
        student1.age = 15;
        student1.printStudentInfo();

        student1.id = "64721611";
        student1.age = 16;
        student1.printStudentInfo();
        //We need attributes to store information about our objects

        Students.printWelcomingMessage(student1.name);
        //Static functions are only accessible from the Class itself
        //It is like Math.sqrt(), Math.round()
        //Static functions are used either as elements of static libraries of functions (such as Math class)
        //In OOP also, static functions are used to represent a behavior shared by ALL objects of that type
        Students.printWelcomingMessage("Mary");
        //It may be useful for example in situations when you want to know how many objects of the given type you have created
    }
}
