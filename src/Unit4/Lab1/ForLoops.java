package Unit4.Lab1;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        //Write a loop that prints 4 5 6 7.
        for(int i = 4; i <= 7; i++) {
            System.out.println(i);
        }

        //You can also count backwards
        for(int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert a word: ");
        String text = sc.next();
        int counter = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.substring(i, i + 1).equals("e")) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " e's.");

        //Build a ladder!
        int height = 4;
        for(int row = 1; row <= height; row++) {
            String line = "";
            for(int star = 1; star <= row; star++) {
                line = line + "*";
            }
            System.out.println(line);
        }

        //Now, let's flip the ladder!
        int height1 = 4;
        for(int row = 1; row <= height1; row++) {
            String line = "";
            for(int star = 4; star >= row; star--) {
                line = line + "*";
            }
            System.out.println(line);
        }

        //Christmas tree
        int height2 = 4;
        for(int row = 1; row <= height2; row++) {
            String line = "";
            for(int star = 1; star <= row; star++) {
                line = line + "*";
            }
            System.out.println(line);
        }
        int height3 = 3;
        for(int row = 1; row <= height3; row++) {
            String line = "";
            for(int star = 3; star >= row; star--) {
                line = line + "*";
            }
            System.out.println(line);
        }
    }
}
/*
REFLECTION:
1. Why do we use i < word.length() and not i <= word.length()?
Ans: Because i starts from 0. If i starts from 1, then we can use i <= word.length().
2. In the ladder, why does the inner loop run row times?
Ans: because the inner loop determines how many times the star is printed. as the number of row increases, the number of stars increases accordingly.
3. When would a for loop be better than a while loop?
Ans: When you are working on a definite loop, for loops are more transparent with the number of times the iteration is repeated.
 */
