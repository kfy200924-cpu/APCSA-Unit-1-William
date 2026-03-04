package Unit8.Lab2;

public class MatrixUtils {
    public static void transpose(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = grid[i][j];
                grid[i][j] = grid[j][i];
                grid[j][i] = temp;
            }
        }
    }

    public static void rotate90(int[][] grid) {
        transpose(grid);
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = grid[i][left];
                grid[i][left] = grid[i][right];
                grid[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static int sumMainDiagonal(int[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            sum += grid[i][i];
        }
        return sum;
    }

    public static int sumAntiDiagonal(int[][] grid) {
        int sum = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            sum += grid[i][n - 1 - i];
        }
        return sum;
    }

    public static boolean isMagicSquare(int[][] grid) {
        int n = grid.length;
        int target = sumMainDiagonal(grid);

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += grid[i][j];
                colSum += grid[j][i];
            }

            if (rowSum != target || colSum != target) {
                return false;
            }
        }

        if (sumAntiDiagonal(grid) != target) {
            return false;
        }

        return true;
    }

    public static int sumBorder(int[][] grid) {
        int n = grid.length;
        int sum = 0;

        for (int j = 0; j < n; j++) {
            sum += grid[0][j];
        }

        for (int j = 0; j < n; j++) {
            sum += grid[n - 1][j];
        }

        for (int i = 1; i < n - 1; i++) {
            sum += grid[i][0];
        }

        for (int i = 1; i < n - 1; i++) {
            sum += grid[i][n - 1];
        }

        return sum;
    }
}
