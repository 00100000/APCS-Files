public class ArraysPartOne {
    public static void main (String[]args) {
        int[] test = {-3, 8, 2, 17, 9, -3, 12, 0, 4, 11};
        System.out.println(range(test)); // 20
    }
    public static int range(int[] array) {
        return max(array) - min(array);
    }
    public static int max(int[] array) {
        int m = -1000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > m) {
                m = array[i];
            }
        }
        return m;
    }
    public static int min(int[] array) {
        int m = 1000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < m) {
                m = array[i];
            }
        }
        return m;
    }
}