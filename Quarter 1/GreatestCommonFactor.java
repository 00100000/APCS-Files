public class GreatestCommonFactor {
    public static void main (String[]args) {
        System.out.println(gcf(6, 8)); // 2
        System.out.println(gcf(3, 15)); // 3
        System.out.println(gcf(39, 91)); // 13
        System.out.println(gcf(1, 350)); // 1
        System.out.println(gcf(100, 8675309)); // 1
        System.out.println(gcf(83, 83)); // 83
    }
    public static int gcf(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcf(b, a % b);
        }
    }
}