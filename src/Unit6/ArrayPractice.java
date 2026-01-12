package Unit6;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr);//Doesn't work

        //Two ways to print the array
        //1:
        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i] + ",");
        }
        //2:
        System.out.println(Arrays.toString(arr));//converts an array to String type. Import java.util.Arrays first to use.

        arr[0] = 10; //Replaces index 0's number.
        arr[1] = 12; //Replaces index 1's number.
        arr[7] = 100; //Replaces index 7's number.

        System.out.println(Arrays.toString(arr));

        //Generate an array with random values.
        for(int i = 0; i < 10; i++) {
            int value = (int)(Math.random() * 100);
            arr[i] = value;
        }

        System.out.println(Arrays.toString(arr));

        //The following code segment prints out an array fulled with null.
        String[] arr2 = new String[5];
        System.out.println(Arrays.toString(arr2));

        //Fill the array with 5 random words.
        arr2[0] = "John";
        arr2[1] = "Sullivan";
        arr2[2] = "Damien";
        arr2[3] = "Louie";
        arr2[4] = "Diangrui"; //Last index is always length - 1.
        System.out.println(Arrays.toString(arr2));

        for(int i = 0; i < arr2.length; i++) {
            if(arr2[i].equals("John")) {
                System.out.println("John is found");
            } else {
                System.out.println("John is not found");
            }
        }

        boolean isFound = false;
        for(int i = 0; i < arr2.length; i++) {
            if(arr2[i].equals("John")) {
                isFound = true;
                break;
            }
        }
        if(isFound) {
            System.out.println("John is found");
        } else {
            System.out.println("John is not found");
        }

        //Initializer list

        int[] arr3 = {1, 10, 6, 5, 19, 20};
        String[] arr4 = {"apple", "banana", "orange"};

        int[] arr5;//Declaration
        arr5 = new int[]{1, 2, 3, 4, 5};//Initialization

    }

    public static boolean compareIntArrays(int[] arr1, int[] arr2) {
        if(arr1 == null || arr2 == null || arr1.length != arr2.length) {
            return false;
        }

        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
