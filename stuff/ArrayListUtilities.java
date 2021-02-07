import java.util.ArrayList;

public class ArrayListUtilities {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(17);
        seed(nums, 10, 1, 10);
        System.out.println(nums);
        System.out.println(min(nums));
        System.out.println(max(nums));
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.add(1);
        nums.add(5);
        nums.add(9);
        nums.add(2);
        nums.add(6);
        nums.add(5);
        nums.add(3);
        System.out.println(nums);
        sortIAL(nums);
        System.out.println(nums);
    }

    public static void seed(ArrayList<Integer> list, int numElements, int minValue, int maxValue) {
        for (int i = 0; i < numElements; i++) {
            list.add((int) (Math.random() * (maxValue - minValue + 1) + minValue));
        }
        System.out.println(list.toString());
    }

    public static int min(ArrayList<Integer> list) {
        int ret = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < ret) {
                ret = list.get(i);
            }
        }
        return ret;
    }

    public static int max(ArrayList<Integer> list) {
        int ret = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > ret) {
                ret = list.get(i);
            }
        }
        return ret;
    }

    public static void sortIAL(ArrayList<Integer> list) {
        final int originalSize = list.size();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < originalSize; i++) {
            temp.add(min(list));
            list.remove(list.indexOf(min(list)));
        }
        for (int i = 0; i < originalSize; i++) {
            list.add(i, temp.get(i));
        }
    }
}