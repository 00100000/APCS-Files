public interface StringList {
    public void add(String str);
    public void add(int index, String str);
    public int size();
    public boolean isEmpty();
    public String get(int index);
    public String set(int index, String newStr);
    public String remove(int index);
}