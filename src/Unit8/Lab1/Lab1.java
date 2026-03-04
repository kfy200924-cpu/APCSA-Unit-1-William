package Unit8.Lab1;

public class Lab1 {
    public static int rowSum(int[][] array, int row) {
        int sum = 0;
        for(int c = row - 1; c < array[c].length; c++) {
            sum += array[row][c];
        }
        return sum;
    }

    public static int colSum(int[][] array, int col) {
        int sum = 0;
        for(int r = 0; r < array.length; r++) {
            sum += array[r][col - 1];
        }
        return sum;
    }

    public static int largestByRow(int[][] arr, int row) {
        int max = arr[row][0];
        for(int c = 1; c < arr[row].length; c++) {
            if(arr[row][c] > max) {
                max = arr[row][c];
            }
        }
        return max;
    }

    public static int largest2(int[][] arr) {
        int max = largestByRow(arr, 0);

        for(int r = 1; r < arr.length; r++) {
            int currentRowMax = largestByRow(arr, r);
            if(currentRowMax > max) {
                max = currentRowMax;
            }
        }
        return max;
    }
}
