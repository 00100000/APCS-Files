public class SetChar {
    public static void main (String[]args) {
        // touch
        String word = "touch";
        System.out.println(word);
        // tough
        word = setChar(word, 3, "g");
        System.out.println(word);
        // rough
        word = setChar(word, 0, 'r');
        System.out.println(word);
        // rouge
        word = setChar(word, 4, (char)(word.charAt(4) - 3));
        System.out.println(word);
    }
    public static String setChar(String str, int index, String ch) {
        return setChar(str, index, ch.charAt(0));
    }
    public static String setChar(String str, int index, char ch) {
        char[] arr = str.toCharArray();
        arr[index] = ch;
        return String.copyValueOf(arr);
    }
}