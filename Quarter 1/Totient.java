public class Totient {
    public static void main (String[]args) {
        System.out.println(totient(8)); // 4
        System.out.println(totient(24)); // 8
        System.out.println(totient(1)); // 1
        System.out.println(totient(105)); // 48
        System.out.println(totient(8675309)); // 8675308
    }
    public static int gcf(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcf(b, a % b);
        }
    }
    public static int totient(int n) {
        int ret = 0;
        for (int i = 0; i < n; i++) {
            if(gcf(n, i) == 1) ret++;
        }
        return ret;
    }
}