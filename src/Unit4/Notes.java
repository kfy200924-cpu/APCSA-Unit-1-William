package Unit4;

public class Notes {
    public static void main(String[] args) {
        //Indefinite loops are loops where the number of times its body repeats is not known in advance.
        //Definite loops are loops that execute a known number of times.
        for(int i = 0; i < 10; i++) { //for(initialization; test; update)
            //statement;
            //statement;
        }
        //The things above are the syntax for a "for loop".

        //print 5 even integers
        System.out.print("Evens: ");
        for(int i = 1; i <= 5; i++) {
            System.out.print(2 * i + " "); //2, 4, 6, 8, 10, nth term? Use 2n.
        }
        //print 5 odd integers
        System.out.print("\nOdds: ");
        for(int i = 1; i <= 5; i++) {
            System.out.print(2 * i - 1 + " "); //1, 3, 5, 7, 9, nth term? Use 2n - 1
        }
        System.out.println();

        //calculate a sum of arithmetic series 2 + 4 + 6 + 8 + 10
        int sum = 0;
        for(int i = 1; i <= 5; i++) {
            sum += 2 * i; //2, 4, 6, 8, 10, nth term? Use 2n.
        }
        System.out.println("Sum: " + sum);

        String text = "John";
        //count how many n's we have
        int counter = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.substring(i, i + 1).equals("n")) {
                counter++;
            }
        }
        System.out.println("We have " + counter + " n's.");

        //print each 4th character of str
        String str = "AJSDLFVNHHAIDOFQJEF";
        for(int i = 0; i < str.length(); i += 3) {
            System.out.print(str.substring(i, i + 1) + " ");
        }
        System.out.println();

        //print a string in reversed order
        //ABCD -> DCBA
        String str1 = "ABCD";
        String reversed = "";
        for(int i = str1.length() - 1; i >= 0; i--) {
            reversed += str1.substring(i, i + 1);
        }
        System.out.println(reversed);

        //nested loops
        int height = 5;
        //*
        //**
        //***
        //****
        //*****
        for(int row = 1; row <= 5; row++) {
            String line = "";
            for(int column = 1; column <= row; column++) {
                System.out.print("*");
            } //inner loop
            System.out.println();
        }

    }
}
