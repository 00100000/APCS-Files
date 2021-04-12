import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            int j = i;
            // find smallest value of array and its index
            for (; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            // swap start of subarray and smallest number of subarray
            array[minIndex] = array[i];
            array[i] = min;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String min = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
            int minIndex = 0;
            int j = i;
            // find smallest value of array and its index
            for (; j < array.length; j++) {
                if (array[j].compareToIgnoreCase(min) < 0) {
                    min = array[j];
                    minIndex = j;
                }
            }
            // swap start of subarray and smallest number of subarray
            array[minIndex] = array[i];
            array[i] = min;
        }
        System.out.println(Arrays.toString(array));
    }
}
