package Unit8.Lab2;

public class MatrixLab {
    public static void main(String[] args) {

        int[][] g1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Original:");
        print(g1);

        // Test transpose
        int[][] g2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrixUtils.transpose(g2);
        System.out.println("\nTransposed:");
        print(g2);

        // Test rotate
        int[][] g3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        MatrixUtils.rotate90(g3);
        System.out.println("\nRotated 90°:");
        print(g3);

        // Test diagonal sums
        System.out.println("\nMain diagonal sum: "
                + MatrixUtils.sumMainDiagonal(g1));
        System.out.println("Anti-diagonal sum: "
                + MatrixUtils.sumAntiDiagonal(g1));

        // Test magic square
        int[][] magic = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        System.out.println("Is magic square? "
                + MatrixUtils.isMagicSquare(magic));

        // Test border sum
        System.out.println("Border sum: "
                + MatrixUtils.sumBorder(g1));
    }

    public static void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
