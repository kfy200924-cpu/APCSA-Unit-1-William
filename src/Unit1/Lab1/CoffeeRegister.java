package Unit1.Lab1;

import java.util.Scanner;

public class CoffeeRegister {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many cups of latte do you need?: ");
        int latteCount = scan.nextInt();
        System.out.println("How much money is for each cup?: ");
        double lattePrice = scan.nextDouble();
        System.out.println("Do you want to give us any tips? ❤: ");
        double tip = scan.nextDouble();
        double total = latteCount * lattePrice + tip;
        System.out.println("That would be " + total + " dollars!");
        //Research findings;
        //double x = 5; it is allowed because it is counted as 5.0. Thus, it can take in both integers and decimals.
        //however, int y = 5.5 is not allowed because it can only take in integers, not decimals.
        System.out.println("\n--- Experiment 1: Integer Division ---");
        System.out.print("How many cookies? ");
        int cookies = scan.nextInt();
        System.out.print("How many kids? ");
        int kids = scan.nextInt();

        double cookiesPerKid = (double) cookies / kids;
        System.out.println("Each kid gets: " + cookiesPerKid + " cookies");
        //It doesn't show 2.333 because the last one is using int.
        //Switching to double can solve this issue.
        System.out.println("\n--- Exiperiment 2: Bonus Points ---");
        int loyaltyPoints = 10;

        System.out.println("Points: " + loyaltyPoints);
        loyaltyPoints += 5; //Add 5
        System.out.println("After bonus: " + loyaltyPoints);

        loyaltyPoints *=2; //Double for weekend promo
        System.out.println("After promo: " + loyaltyPoints);

        int a = 5;
        int b = 5;
        int c = ++a; //prefix: increment THEN assign
        int d = b++; //postfix: assign THEM increment

        System.out.println("c = " + c + ", a = " + a); //c=6, a=6
        System.out.println("d = " + d + ", b = " + b); //d=5, b=6

        double itemPrice = 3.99;
        int quantity = 2;
        double subtotal = itemPrice * quantity;

        int roundedPrice = (int) subtotal; //BUG: won't compile!
        //int only deletes the decimal places, while Math.round() can really round it in a mathematical way.
        System.out.println("Rounded total: " + roundedPrice);
        //The original code used int to equal to a double. By switching subtotal into int, we can solve this issue.

        /*
        REFLECTION QUESTIONS:
        1. What happens when you store a double in an int? What is lost?
        Ans: The decimals behind the number will be lost.
        2. Why does 5 / 2 give 2, not 2.5?
        Ans: Because when we use int, it doesn't show the decimal places.
        3. When would you use explicit casting? When is it automatic?
        Ans: Because sometimes, we need to show the decimal part. When you switch from a double to int, it will automatically delete the decimal places.
        4. What's one real-world situation where ++x vs x++ could cause a bug?
        Ans: When using the wrong code, it will come to unexpected results.
        5. What surprised you most about how Java handles numbers?
        Ans: It is a bit complicated when handling doubles and ints.
         */
    }
}
