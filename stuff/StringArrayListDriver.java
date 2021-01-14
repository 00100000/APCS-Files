public class StringArrayListDriver {
    public static void main(String[] args) {
        StringArrayList list = new StringArrayList(0);
        String sentence = "To be or not to be that is the question";
        String[] words = sentence.split(" ");
        for(String s : words) {
            list.add(s);
        }
        removeWithLength(list, 3);
        System.out.println(list);
    }
    public static void removeWithLength(StringArrayList list, int length) {
        for(int i=0;i<list.size();i++)if(list.get(i).length()==length)list.remove(i);
    }
}