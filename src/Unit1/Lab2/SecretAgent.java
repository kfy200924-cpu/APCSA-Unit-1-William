package Unit1.Lab2;

import java.util.Scanner;

public class SecretAgent {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your 7-digit agent ID: ");
        int phoneNumber = scan.nextInt();

        int last4 = phoneNumber % 10000; //Gets remainder when divided by 10000
        System.out.println("Last 4 digits: " + last4);

        int d1 = last4 % 10; //ones digit
        int d2 = last4 / 10 % 10; //tens digit
        int d3 = last4 / 100 % 10; //hundreds
        int d4 = last4 / 1000 % 10; //thousands
        System.out.println("Digit: " + d4 + ", " + d3 + ", " + d2 + ", " + d1 + ".");
        //By dividing the number, we can get specific numbers for the digits because int will eliminate all the numbers after the decimal point.
        //Then, when the desired number is at the last, then it can be extracted by using % 10.

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scan.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        //If we use int, then the decimal places will be eliminated and the output will be inaccurate.

        int C = 22;
        int F = C * 9 / 5 + 32;
        System.out.println("Int version: " + F);
        //Integer division truncates. Use double for more precision.

        int code = 1 + 2 * 5 + (3 + 7);
        System.out.println("Vault code: " + code);
        //I predict that the code will be 21
        //It is correct!

        System.out.println(5 + 3 * 2); //11
        System.out.println((5 + 3) * 2); //16
        System.out.println(10 / 3 * 2); //6
        System.out.println(10.0 / 3 * 2); //6.67

        //I was correct

        System.out.println(1 + 2 * 3); //7
        System.out.println("Score: " + 1 + 2 * 3); //Score: 16
        System.out.println("Score: " + (1 + 2 * 3)); //Score: 7
        System.out.println(5 / 2 + 1.5); //3.5
        System.out.println(5.0 / 3 + 1.5); //3.167

        //I was correct

        //String + anything -> string concatenation
        //Arithmetic happens first only if not "pulled" into string context
        //int/int -> int (truncated), unless one is double

        /*
        REFLECTION QUESTIONS:
        1. Why does 7 / 3 give 2, not 2.333? How can you get the decimal answer?
        Ans: Because 7 and 3 are integral values. By changing 7 into 7.0, we can get the decimal answers.
        2. How can you extract the middle digit of a 3-digit number (like 583 -> 8)?
        Ans: By /10 and %10, we eliminate the last digit and find the remainder, which is 8.
        3. Why does "Answer: " + 5 + 3 give "Answer: 53", but "Answer: " + (5 + 3) give "Answer: 8"
        Ans: By adding a parenthesis around 5 + 3, it is changed to an integer calculation instead of a string combination.
        4. When converting Celsius to Fahrenheit, why is it dangerous to use all integers?
        Ans: Because the output will not be precise. It will eliminate the decimal places.
        5. Research: What is "operator precedence"? List the order of: +, *, /, %, ().
        Ans: It is the order in which Java operates integral calculations. The order should be in (), %, * and /, then +.
        6. Bonus: How would you get the first digit of a 4-digit number? (e.g., 7284 -> 7)
        Ans: Just simply /1000 then %10.
         */
    }
}
