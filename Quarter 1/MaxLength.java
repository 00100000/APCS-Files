public class MaxLength {
    public static void main(String[] args) {
        int[][] table = {{ 23, 0, 425, -25 },
                        { 1856, 24601, 7, 92 },
                        { -3, 18, -2053, 13 }};
        System.out.println(maxLength(table));
    }

    public static int maxLength(int[][] table) {
        int ret = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if ((table[i][j] + "").length() > ret) {
                    ret = (table[i][j] + "").length();
                }
            }
        }
        return ret;
    }
}