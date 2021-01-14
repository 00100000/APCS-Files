public class Tolerance {
    public static void main (String[]args) {
        // test cases
        System.out.println(approxEquals(3.0, 2.99, 0.01));
        System.out.println(approxEquals(3.0, 2.99, 0.02));
        System.out.println(approxEquals(3.0, 2.99, 0.001));
        System.out.println(approxEquals(7.0, 9.0, 0.001));
    }
    public static boolean approxEquals(double a, double b, double tolerance) {
        // shortest solution I could come up with
        // absolute value because of negatives
        return Math.abs(a-b)<=tolerance;
    }
}