public class AlphabeticalArraysOfStrings {
    public static void main (String[]args) {
        String[] a = {"A", "car", "drove", "fast"};
        String[] b = {"A", "cat", "ran", "fast"};
        String[] c = {"He", "read", "4", "words"};
        String[] d = {"I'm", "really", "really", "tired"};
        String[] e = {"tomato"};
        String[] f = {};
        System.out.println(isAlphabetical(a)); // true
        System.out.println(isAlphabetical(b)); //  false
        System.out.println(isAlphabetical(c)); //  false (digits come before letters in Unicode)
        System.out.println(isAlphabetical(d)); //  true (they're still in order)
        System.out.println(isAlphabetical(e)); // true (it's not out of order)
        System.out.println(isAlphabetical(f)); //  true
    }
    public static boolean isAlphabetical(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].compareToIgnoreCase(words[i + 1]) > 0) return false;
        }
        return true;
    }
}