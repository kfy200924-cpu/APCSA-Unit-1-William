package Unit2.Lab2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        printName();
    }

    public static void printName() {
        Scanner scan = new Scanner(System.in);
        String fullName = scan.nextLine(); //Full name
        //Michael Benjamin Smith

        int firstSpace = fullName.indexOf(" ");
        //System.out.println(firstSpace);
        String firstName = fullName.substring(0, firstSpace);
        System.out.println(firstName);

        fullName = fullName.substring(firstSpace + 1);
        int secondSpace = fullName.indexOf(" ");
        String secondName = fullName.substring(0, secondSpace);
        System.out.println(secondName);

        String lastName = fullName.substring(secondSpace + 1);
        System.out.println(lastName);




    }
}
