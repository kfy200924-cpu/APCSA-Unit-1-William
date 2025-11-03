package Unit3.Lab2;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        int count = 1;
        while(count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter a number between 1 and 1000: ");
        number = scanner.nextInt();
        while(number < 1 || number > 1000) {
            System.out.print("Invalid! Enter a number between 1 and 1000: ");
            number = scanner.nextInt();
        }

        System.out.println("Valid number: " + number);

        System.out.print("Enter a word (a - c): ");
        String word = scanner.next();

        while(checkInput(word) == false) {
            System.out.print("Invalid word! Enter a word between 'a' and 'c': ");
            word = scanner.next();
        }
        System.out.println("Valid word: " + word);
    }

    public static boolean checkInput(String word) {
        return word.compareTo("a") >= 0 && word.compareTo("c") <= 0;
    }
}
