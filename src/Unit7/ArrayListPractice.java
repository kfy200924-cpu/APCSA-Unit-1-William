package Unit7;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        int[] arr = new int[10];

        //Type name = new Type();
        //Student students = new Student();
        //Scanner sc = new Scanner();

        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<int> list; x
        //Cannot store primitives.
        //However, you can use wrapper classes.
        //Convert objects of one type to another.
        //Convert primitives to references.
        int x = 5; //Primitive
        Integer y = x; //Reference
        //The process of converting primitive to reference is called boxing.

        int z = y; //Unboxing - Converting reference back to primitives.

        list.add(10); //10 is primitive
        //Under the hood java is boxing this primitive into reference Integer.
        Double d = 10.0;
        Boolean b = true;

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        list.add(3);
        list.add(7);
        list.add(100);
        list.add(5);
        list.add(-10);

        System.out.println("The list stores " + list.size() + " elements");

        System.out.println(list);
        list.remove(5);
        System.out.println(list);

        //To read the element from a list, use get()

        System.out.println(list.get(1));
        System.out.println(list.set(1, 4));//put value 4 at position 1

        ArrayList<String> names;
        names = new ArrayList<>();
        System.out.println(names);//Not null. Just holds 0 elements

        names.add("John");
        names.add("Mary");
        names.add("Sam");
        names.add("Jacky");
        System.out.println(names);

        //Find the longest name in a list

        String longestName = names.get(0);
        for(int i = 0; i < names.size(); i++) {
            String currentName = names.get(i); //get the name from a list
            int length = currentName.length(); //check its length
            if(length > longestName.length()) { //compare the current length with the supposedly longest.
                longestName = currentName;
            }
        }

        System.out.println(longestName);

        //Suppose allWords is an arraylist of words entered by user. Remove all plural words from allWords.
        String[] words = {"books", "cups", "phone", "pen", "desks"};
        ArrayList<String> allWords = new ArrayList<>(Arrays.asList(words));
        for(int j = 0; j < allWords.size(); j++) {
            String currentWord = allWords.get(j);
            if(currentWord.lastIndexOf("s") == currentWord.length() - 1) {
                allWords.remove(j);
                j--;
                }
            }
        System.out.println(allWords);
        }
    }