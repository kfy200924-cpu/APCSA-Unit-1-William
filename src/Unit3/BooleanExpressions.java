package Unit3;

import java.util.Scanner;

public class BooleanExpressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //clientValidation(25, false);
        //clientValidation(14, true);
        //clientValidation(25, true);

        getGrade(98);
    }

    public static void getGrade(int percentage) {
        //>= 90% is A, >= 80% is B, >= 70% is C, >= 60% is D, and <60% is F.
        if(percentage >= 90) {
            System.out.println("Your grade is A!");
        } else if(percentage >= 80) {
            System.out.println("Your grade is B!");
        } else if(percentage >= 70) {
            System.out.println("Your grade is C!");
        } else if(percentage >= 60) {
            System.out.println("Your grade is D...");
        } else {
            System.out.println("Your grade is F...");
        }
    }

    public static void clientValidation(int age, boolean isRegistered) {
        if(age < 18) {
            System.out.println("The age is less than 18");
        }
        if(!isRegistered) {
            System.out.println("Please apply for registration first");
        }
    }
    public static void passwordValidation(Scanner sc) {
        System.out.println("Enter password: ");
        String text1 = sc.nextLine(); //Reference 1

        System.out.println("Enter password again: ");
        String text2 = sc.nextLine(); //Reference 2

        //We cannot do reference == another reference if we want to compare content.
        boolean equal = text1.equals(text2);

        //System.out.println(equal);
        if(equal) {
            System.out.println("Password is validated!");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
