package Unit1.Lab1;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        //Getting user input
        Scanner scanner = new Scanner(System.in);

        //Getting text input
        System.out.println("What is your name?: ");
        String text = scanner.nextLine();
        //next() and nextLine() are functions of the Scanner class that allows us to get user text input
        System.out.println("the entered text is: " + text);
        //When we type in "1", we get string literal "11" but not number 2 because text is not a numerical value.
        System.out.println("Enter an integer number: ");
        int num = scanner.nextInt();
        System.out.println("doubled number: " + num * 2);

    }
}
