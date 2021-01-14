import java.util.Arrays;

public class MultisearchRedux {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        // random array of 10k
        for (int i = 0; i < 10000; i++) {
            arr[i] = (int)(Math.random()*10);
        }

        System.out.println(Arrays.toString(multiSearch(arr, 5)));
    }

    public static int[] multiSearch(int[] array, int key) {
        int[] result = new int[0];
        for (int i = 0; i < array.length; i++) {
            // elongate array and add index that contains key
            if (array[i] == key) {
                result = resize(result, result.length + 1);
                result[result.length - 1] = i;
            }
        }
        return result;
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