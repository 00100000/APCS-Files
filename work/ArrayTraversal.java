public class ArrayTraversal {
    public static void main(String[] args) {
        int[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println(search(a, 4)); // 2
        System.out.println(search(a, 1)); // 1
        System.out.println(search(a, 3)); // 0
        System.out.println(search(a, 5, 1)); // 4
        System.out.println(search(a, 6, 5)); // 7
        System.out.println(search(a, 7, 2)); // -1
    }
    public static int search(int[] array, int key) {
        return search(array, key, 0);
    }
    public static int search(int[] array, int key, int startIndex) {
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}