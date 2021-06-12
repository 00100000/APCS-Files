public class PrimeFactorization {
    public static void main (String[]args) {
        System.out.println(primeFactor(42)); // "2 3 7"
        System.out.println(primeFactor(12)); // "2 2 3"
        System.out.println(primeFactor(65536)); // "2 2 2 2 2 2 2 2 2 2 2 2 2 2 2 2"
        System.out.println(primeFactor(8675309)); // "8675309"
    }
    public static String primeFactor(int n) {
        String factors = "";
        for (int i = 2; i <= n; i++) {
            // if a prime factor appears multiple times, we'll need a while loop.
            // This solution works because any bigger numbers that divide into n
            // will always break down to their smaller factors at the start of the
            // while loop.
            while (n % i == 0) {
                factors += i + " ";
                n /= i;
            }
        }
        return factors.trim();
    }
}