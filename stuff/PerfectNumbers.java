public class PerfectNumbers {
    public static void main (String[]args) {
        System.out.println(isPerfect(5));
        System.out.println(isPerfect(6));
        System.out.println(isPerfect(27));
        System.out.println(isPerfect(28));
    }
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n - 1; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return n == sum;
    }
}