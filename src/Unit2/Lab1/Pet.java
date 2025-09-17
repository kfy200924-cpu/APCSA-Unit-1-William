package Unit2.Lab1;

public class Pet {
    private String name;
    private String species;
    private int age;
    private double weight;

    public Pet(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
     public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be positive.");
        }
     }
     public void makeSound() {
        if (species.equals("Dog")) {
            System.out.println(name + " says Woof!");
        } else if (species.equals("Cat")) {
            System.out.println(name + " says Meow!");
        } else {
            System.out.println(name + " makes a sound.");
        }
     }
     public void displayInfo() {
         System.out.println("Name: " + name);
         System.out.println("Species: " + species);
         System.out.println("Age: " + age + " years");
         System.out.println("Weight: " + weight + " lbs");
     }
}
/*
1. Why do we make attributes private instead of public?
Ans: We make attributes private to enforce encapsulation, protecting an object's internal state from invalid access.
2. What is a method signature? Give an example from your code.
Ans: It is a unique combination of the method's name and its parameters.
3. What is the difference between a getter and a setter?
Ans: A getter can access information from private fields in other classes, while a setter control how the data is changed.
4. Why did we add if-statements in some setters?
Ans: If-statements are used to validate input data.
5. What would happen if we removed the 'this.' keyword in the constructor?
Ans: The instance variables wouldn't get set.
6. When should a method return a value? When should it return void?
Ans: Return value for results, void for actions.
 */