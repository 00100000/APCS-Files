import java.util.ArrayList;

public class OutOfPlaceSort {
    public static void sortList(ArrayList<Integer> list) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        while (list.size() > 0) {
            int max = Integer.MAX_VALUE;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < max) max = list.get(i);
            }
            list.remove(list.indexOf(max));
            tempList.add(max);
        }
        System.out.println(tempList.toString());
    }
}