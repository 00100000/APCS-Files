import java.util.Random;

public class BinarySearch {

    public static int[] generate(int length, int low, int high) {
        int[] result = new int[length];
        Random randGen = new Random();
        for (int i = 0; i < length; i++) {
            result[i] = randGen.nextInt(high - low + 1) + low;
        }
        return result;
    }

    public static int[] generateSorted(int length) {
        int[] result = new int[length];
        Random randGen = new Random();

        result[0] = 1;
        for (int i = 1; i < length; i++) {
            result[i] = result[i - 1] + randGen.nextInt(2);
        }
        return result;
    }

    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == key) return mid;
            if (array[mid] > key) right = mid - 1;
            if (array[mid] < key) left = mid + 1;
        }
        return -1;
    }
}