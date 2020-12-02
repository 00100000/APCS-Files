import java.util.Arrays;

public class RowStrings {
    public static void main (String[]args) {
        char[][] letters = {{'G','r','e','a','t'},
                            {'W','h','i','t','e'},
                            {'S','h','a','r','k'},
                            {'D','o',' ','d','o'},
                            {'D','o',' ','d','o'},
                            {'D','o',' ','d','o'}};
        System.out.println(Arrays.toString(rowStrings(letters)));
    }
    public static String[] rowStrings(char[][] characters) {
        String ret = "", temp;
        for (int i = 0; i <= characters[0].length; i++) {
            temp = "";
            for (int j = 0; j < characters.length - 1; j++) {
                temp += characters[i][j];
            }
            ret += " " + temp;
        }
        return ret.trim().split(" ");
    }
}