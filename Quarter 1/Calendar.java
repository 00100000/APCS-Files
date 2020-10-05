public class Calendar {
    public static void main (String[]args) {
        System.out.println(isValidDate(3, 6, 1973)); // true
        System.out.println(isValidDate(4, 31, 2010)); // false
        System.out.println(isValidDate(13, 2, 1993)); // false
        System.out.println(isValidDate(5, 13, -203)); // false
        System.out.println(isValidDate(2, 29, 2020)); // true
        System.out.println(isValidDate(2, 29, 2021)); // false
        System.out.println(isValidDate(2, 29, 2100)); // false
        System.out.println(isValidDate(2, 29, 2400)); // true
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }

    public static boolean isValidDate(int month, int day, int year) {
        // array of day lengths
        int[] dayLen = {0, 31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // one line of all things that can go wrong :P
        if (year <= 0 || month < 1 || month > 12 || day < 1 || day > dayLen[month]) return false;
        return true;
    }
}