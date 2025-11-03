package Unit3;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {
        random();
    }

    public static void random() {
        Scanner sc = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        System.out.println("What is number1 - number2?");
        if(number2 > number1) {
            System.out.println(number2 + " - " + number1);
        } else {
            System.out.println(number1 + " - " + number2);
        }

        int answer = sc.nextInt();
        if(answer == Math.abs(number1 - number2)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
