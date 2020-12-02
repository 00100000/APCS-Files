public class FormattedTable {
    public static void main (String[]args) {
        int[][] table = {{23, 0, 425, -25},
                        {1856, 24601, 7, 92},
                        {-3, 18, -2053, 13}};
        printTable(table);
    }
    public static void printTable(int[][] table) {
        int max = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                if ((table[i][j] + "").length() > max) {
                    max = (table[i][j] + "").length();
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.printf("%" + max + "s", table[i][j] + " ");
            }
            System.out.println("");
        }
    }
}