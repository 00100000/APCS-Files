public class StringArrayList implements StringList {
    private String[] arr;
    public StringArrayList() {
        arr = new String[0];
    }
    public StringArrayList(int initLength) {
        arr = new String[initLength];
    }
    public String toString() {
        if (arr.length == 0) return "[]";
        String ret = "";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i] + ", ";
        }
        return "[" + ret.substring(0, ret.length() -2) + "]";
    }
    private void resize(int newLength) {
        String[] newArr = new String[newLength];
        for (int i = 0; i < (newLength > arr.length ? arr.length : newLength); i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public void add(String str) {
        resize(arr.length + 1);
        arr[arr.length - 1] = str;
    }
    public void add(int index, String str) {
        if (arr.length < index) {
            throw new IndexOutOfBoundsException();
        }

        String[] newArr = new String[arr.length + 1];
        int trueI = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                newArr[trueI] = arr[i];
            } else {
                trueI++;
            }
        }
    }
    public int size() {
        return arr.length;
    }
    public boolean isEmpty() {
        return arr.length == 0;
    }
    public String get(int index) {
        if (arr.length < index) {
            throw new IndexOutOfBoundsException();
        }

        return arr[index];
    }
    public String set(int index, String newStr) {
        if (arr.length < index) {
            throw new IndexOutOfBoundsException();
        }

        String ret = arr[index];
        arr[index] = newStr;
        return ret;
    }
    public String remove(int index) {
        if (arr.length < index) {
            throw new IndexOutOfBoundsException();
        }
        String ret = arr[index];
        String[] newArr = new String[arr.length - 1];
        int trueI = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[trueI] = arr[i];
                trueI++;
            }
        }
        arr = newArr;
        return ret;
    }
}