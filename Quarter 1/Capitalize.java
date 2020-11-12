public class Capitalize {
    public static void main (String[]args) {
        System.out.println(capitalize("bobby")); // "Bobby"
        System.out.println(capitalize("ILENE")); // "Ilene"
        System.out.println(capitalize("yOU-tUbER")); // "You-tuber"
        System.out.println(capitalize("l33t haXXor")); // "L33t haxxor"
        System.out.println(capitalize("3-Point shot")); // "3-point shot"
    }
    public static String capitalize(String str) {
        return str.toLowerCase().replaceFirst("" + str.toLowerCase().charAt(0), "" + Character.toUpperCase(str.charAt(0)));
    }
}