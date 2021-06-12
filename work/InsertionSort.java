import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i - 1;
            // move elements up if they're smaller than array[i]'s value
            for (; j >= 0 && array[j] > temp; j--) {
                array[j + 1] = array[j];
            }
            // insert value of array[i] after moving up the elements
            array[j + 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
