public class MagicSquares {
    public static void main (String[]args) {
        int[][] a = {{8, 1, 6},
                    {3, 5, 7},
                    {4, 9, 2}};
        int[][] b = {{17, 3, 13},
                    {7, 11, 15},
                    {9, 19, 5}};
        int[][] c = {{7, 7, 7},
                    {7, 7, 7},
                    {7, 7, 7}};
        int[][] d = {{-1, 1, 0},
                    {1, 0, -1},
                    {0, -1, 1}};
        int[][] e = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        // true
        System.out.println(isMagicSquare(a));
        System.out.println(isMagicSquare(b));
        System.out.println(isMagicSquare(c));
        System.out.println(isMagicSquare(d));
        // false
        System.out.println(isMagicSquare(e));
    }
    public static boolean isMagicSquare(int[][] grid) {
        // get expected sum from first row
        int temp = 0;
        int expectedSum = 0;
        for (int i = 0; i < grid.length; i++) {
            expectedSum += grid[0][i];
        }
        // rows
        for (int a = 0; a < grid.length; a++) {
            temp = 0;
            for (int b = 0; b < grid.length; b++) {
                temp += grid[a][b];
            }
            if (temp != expectedSum) return false;
        }
        // columns
        for (int c = 0; c < grid.length; c++) {
            temp = 0;
            for (int d = 0; d < grid.length; d++) {
                temp += grid[d][c];
            }
            if (temp != expectedSum) return false;
        }
        // diagonals
        int f = 0;
        temp = 0;
        for (int e = 0; e < grid.length; e++) {
            temp += grid[e][f];
            f++;
        }
        int h = 0;
        temp = 0;
        for (int g = grid.length - 1; g > 0; g--) {
            temp += grid[g][h];
            h++;
        }
        return true;
    }
}