package Unit1;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Question 1

        System.out.println("Enter a mass in kg: ");
        double mass = scan.nextDouble();

        System.out.println("Enter a velocity in m/s: ");
        double velocity = scan.nextDouble();

        double KE = 0.5 * mass * Math.pow(velocity, 2);
        System.out.println("The Kinetic Energy is: " + KE + " joules");

        //Question 2

        System.out.println("Enter first int value: ");
        int a = scan.nextInt();

        System.out.println("Enter second int value: ");
        int b = scan.nextInt();

        System.out.println("Enter third int value: ");
        int c = scan.nextInt();

        double mean = (double) (a + b + c) / 3.0;
        System.out.println("Mean: " + mean);

        //Question 3

        System.out.println("Enter your number: ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            if (number > 0) {
                System.out.println("The number is even and positive.");
            } else {
                System.out.println("The number is even and negative.");
            }
        } else {
            if (number > 0) {
                System.out.println("The number is odd and positive.");
            } else {
                System.out.println("The number is odd and negative.");
            }
        }

        //Question 4
        System.out.println("Enter how many integers you want to sum: ");
        int n = scan.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println("The sum of 1 to " + n + " is " + sum);


    }
}