package Unit2.Lab1;

public class PetClinic {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Buddy", "Dog", 5, 35.0);
        Pet pet2 = new Pet("Luna", "Cat", 3, 9.5);
        //It did not appear. Why?

        pet1.displayInfo();
        pet2.displayInfo();
        pet1.makeSound();
        pet2.makeSound();
        pet1.setAge(6);
        System.out.println(pet1.getName() + " is now " + pet1.getAge() + " years old.");
        pet2.setAge(10);
        System.out.println(pet2.getName() + " is now " + pet2.getAge() + " years old.");
    }
}
