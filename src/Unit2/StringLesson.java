package Unit2;

public class StringLesson {
    public static void main(String[] args) {
        String text = "Hello";
        String text1 = new String("Hello"); //Constructor - A method used to instantiate (create) an object.
        String text2 = "1" + 2; //Java automatically casts int (or any primitive) to String if you have at least one String literal in the expression.
        System.out.println(text2);
        System.out.println(1 + 3 + "25"); //425
        System.out.println("25" + 3 + 1); //2531, not 254
        //this is like "25" + "3" + "1" because Java executes everything from the left side.
        System.out.println("25" + (3 + 1)); //254
        //Parenthesis forces the algebraic expression to be executed first.

        //Method: String(String str)
        //Description: Constructs a new String object that represents the same sequence of characters as str.

        //Method: int length()
        //Description: Returns number of characters in this string.

        //Method: substring(index1, index2) or substring (index1)
        //Description: Returns the characters in this string from index1 (inclusive) to index2 (exclusive); if index2 is omitted, grabs till end of string.

        //Method: boolean equals(String other)
        //Description: Returns true if this is equal to the String.

        System.out.println(5 == 6);
        System.out.println(1.3 == 1.3);

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1 == s2); //returns false. This is because == compares the memory addresses. The location stored for the two strings are different.
        //However, you can use it to compare values.

        String s3 = "abc"; //String literals
        String s4 = "abc"; //String literals

        System.out.println(s3 == s4); //returns true because the two variables are stored as the same string literals, meaning that it's in the same memory location.

        //Method "equals" allows us to compare the actual content of String objects without knowing anything about their memory locations.

        System.out.println("abc".equals("abc"));

        System.out.println("523A".compareTo("ABC"));
        System.out.println("ABC".compareTo("abc"));
        //Digits -> Capitals -> Lowercases

        //Strings are immutable
        String text3 = "abcd";
        text3 = "cdef";

        String text4 = "Hello \"Java\""; //Hello "Java"

        String path = "C:\\documents";
        System.out.println(path);
        System.out.println(text4);
        System.out.println("Hello AP CS A \nJava");


    }
}
