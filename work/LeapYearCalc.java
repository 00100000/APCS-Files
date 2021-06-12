public class LeapYearCalc {
    public static void main (String[]args) {
        System.out.println(isLeapYear(4));
        System.out.println(isLeapYear(100));
        System.out.println(isLeapYear(400));
        System.out.println(isLeapYear(8743));
        System.out.println(isLeapYear(2020));
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }
}