package Unit6;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }


        for (int element : arr) {
            element = 1;
        }

        System.out.println(Arrays.toString(arr));

        for (int element : arr) {
            System.out.println(element + ",");
        }

        //Calculate an average grade
        int[] grades = {10, 85, 27, 73, 65};
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        System.out.println("Average grade is " + sum / grades.length);

        //Enhanced for each loops cannot be used in all situations. Only use for-each loops when you want to loop through all the elements in the array without changing their values
        //Do not use for each loops if you need the index.
        //Do not use for each loops if you need the change the values in the array.
        //Do not use for each loops if you want to loop through only parts of an array or in some irregular order.

        //References vs Primitives
        int x = 5;
        times2(x); //5 * 2 = 10 functions do not change primitive values.
        System.out.println(x);

        int[] arr2 = {1, 2, 3};
        triple(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr2copy = arr2;
        triple(arr2copy);
        System.out.println(Arrays.toString(arr2copy));
        System.out.println(Arrays.toString(arr2));

        //the only way:
        int[] arr3 = new int[arr2.length];//new reference
        for(int i = 0; i < arr3.length; i++) {
            arr3[i] = arr2[i];
        }


        int y = 1113591;
        System.out.println(mostFrequentDigit(y));


        System.out.println();
    }

    public static void times2(int a) {
        a *= 2;//This is a copy of actual x
    }

    public static void triple(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] *= 3;//arr[i] = arr[i] * 3
        }
    }

    public static int mostFrequentDigit(int number) {
        int[] freq = new int[10];
        //Collection of Frequencies
        while(number > 0) {
            int lastDigit = number % 10;
            freq[lastDigit]++;
            number = number / 10;
        }

        //Looking for an index of the largest frequency
        int index = 0;
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > freq[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int mode(int[] grade) {
        int[] freq = new int[101];
        int index = 0;
        for(int i = 0; i < grade.length; i++) {
            int digit = grade[i];
            freq[digit]++;
        }
        for(int j = 0; j < freq.length; j++) {
            if(freq[j] > freq[index]) {
                index = j;
            }
        }
        return index;
    }
}


