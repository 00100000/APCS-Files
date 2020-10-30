import java.util.Arrays;

public class ArrayResizing {
    public static void main (String[]args) {
        int[] a = {3, 1, 4, 1, 5, 9};
        System.out.println(Arrays.toString(resize(a, 4)));
        System.out.println(Arrays.toString(resize(a, 7)));
    }
    public static int[] resize(int[] array, int newLength) {
        int[] ret = new int[newLength];
        for(int i = 0; i < newLength; i++) {
            if (i >= array.length) break;
            ret[i] = array[i];
        }
        return ret;
    }
}