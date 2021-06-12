import java.util.Random;
import java.util.Arrays;

public class Sorting {

    public static int[] generate(int length, int low, int high) {
        int[] result = new int[length];
        Random randGen = new Random();
        for (int i = 0; i < length; i++) {
            result[i] = randGen.nextInt(high - low + 1) + low;
        }
        return result;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0, j = 1; i < array.length - 1; i++, j++) {
            if (array[i] > array[j])
                return false;
        }
        return true;
    }

    public static void bubbleSort(int[] array) {
        int temp = 0;
        while (!isSorted(array)) {
            for (int i = 0, j = 1; i < array.length - 1; i++, j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
