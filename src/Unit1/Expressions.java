package Unit1;

import java.util.Scanner;

public class Expressions {
    public static void main(String[] args) {
        System.out.println(5 / 2); //2.5?
        //When you divide integer by integer, you get another integer.
        //Thus, it can't be 2.5.

        double x = 5 / 2; //Implicit casting
        System.out.println(x);
        //It gives us 2.0. But why not 2.5?
        //It is because we're still using integers.
        //Implicitly, Java stores 2 into x and converts it to a double, 2.0, instead of 2.5.
        int y = (int) 5.7; //Explicit casting
        System.out.println(y);
        //Java did not round. It just cuts the digits after the decimal point.

        int z = Integer.parseInt("12551");
        System.out.println(z);

        int phoneNumber = 1524618;
        System.out.println(Integer.MAX_VALUE); //Finding the largest possible value for Int
        System.out.println(Integer.MIN_VALUE); //Finding the smallest possible value for Int
        int first = phoneNumber % 10; //8
        phoneNumber = phoneNumber / 10; //we remove 8
        //after that, the phoneNumber becomes 152461

        int second = phoneNumber % 10; //1
        phoneNumber = phoneNumber / 10; //15246

        int third = phoneNumber % 10; //6
        phoneNumber = phoneNumber / 10; //1524

        System.out.println("Last three digits: " + first + ", " + second + ", " + third + ".");

        //How to check even/odd numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any positive integer: ");
        int input = scan.nextInt();

        if(input % 2 == 0) {
            System.out.println("Your number is even.");
        } else {
            System.out.println("Your number is odd.");
        }

    }
}
