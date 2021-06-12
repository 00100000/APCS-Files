import java.util.Arrays;

public class Merging {
    private static int[] temp;
    public static void main (String[]args) {
        int[] data = {3, 1, 4, 2, 3, 5, 7, 9, 1, 1, 3, 4, 6, 6, 2, 9, 4};
        merge(data, 3, 7, 8, 13);
    }
    // preconditions: the sections array[startIndex1] to array[endIndex1]
    // and array[startIndex2] to array[endIndex2] are already sorted
    // startIndex2 == endIndex1 + 1
    private static void merge(int[] array, int startIndex1, int endIndex1, int startIndex2, int endIndex2) {
        temp = new int[endIndex2 - startIndex1];
        int tempStartIndex1 = 0;
        for (int i = 0; i < endIndex2 - startIndex1; i++) {
            temp[i] = array[tempStartIndex1];
            tempStartIndex1++;
        }
        Arrays.sort(temp);
        int tempI = 0;
        for (int i = startIndex1; i < endIndex2; i++) {
            array[i] = temp[tempI];
            tempI++;
        }
        System.out.println(Arrays.toString(array));
    }
}