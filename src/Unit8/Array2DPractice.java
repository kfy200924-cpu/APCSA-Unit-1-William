package Unit8;

import java.util.Arrays;

public class Array2DPractice {
    public static void main(String[] args) {
        int[][] matrix = new int[3][5];
        int[][] matrix1 = new int[3][3];

        String[][] matrix2 = new String[2][5];

        int[] arr = {1, 2, 3, 4, 5};
        int[][] matrix3 = {{1, 2, 3}, {1, 3, 5}, {4, 5, 10}};
        //int[][] matrix3 = {{row1}, {row2}, {row3}};
        //two-dimensional array is the array of arrays

        System.out.println(Arrays.toString(matrix3));

        //If you want to iterate over rows you have to run nested loops.
        for(int[] array : matrix3) {
            for(int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        for(int row = 0; row < matrix3.length; row++) {
            for(int col = 0; col < matrix3[0].length; col++) {
                System.out.print(matrix3[row][col] + " ");
            }
            System.out.println();
        }
        //matrix3.length - number of rows
        //matrix3[0].length - number of columns
        int[][] arr2 = {{10, 11, -10}, {7, 125, 3}, {5, 1, 100}};

        int largest = Integer.MIN_VALUE;
        for(int[] row : arr2) {
            for(int element : row) {
                if(element > largest)
                    largest = element;
            }
        }
        System.out.println(largest);

        //Printing 2D Arrays using Arrays.toString()
        for(int[] array : matrix3) {
            System.out.println(Arrays.toString(array));
        }
    }

    public int sum(int[][] a) {
        int sum = 0;
        for(int[] row : a) {
            for(int value : row) {
                sum += value;
            }
        }
        return sum;
    }
}
