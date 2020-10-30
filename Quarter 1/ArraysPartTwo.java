import java.util.Arrays;
import java.util.ArrayList;

public class ArraysPartTwo {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
        System.out.println(Arrays.toString(multiSearch(nums, 5)));
    }

    public static int[] multiSearch(int[] array, int key) {
        // not having expanding arrays makes me very sad so I use an ArrayList
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                nums.add(i);
            }
        }
        // converting ArrayList to int[]
        int[] ret = new int[nums.size()];
        for (int j = 0; j < nums.size(); j++) {
            ret[j] = nums.get(j).intValue();
        }
        return ret;
    }
}