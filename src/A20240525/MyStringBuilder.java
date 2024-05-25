package A20240525;

public class MyStringBuilder {
    private char[] arr = new char[0];
    private int oldLength = arr.length;

    public void append(char ch) {
        int length = 1;
        int newLength = oldLength + length;
        if (oldLength > 0) {
            arr[newLength] = ch;
        }
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
