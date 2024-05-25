package A20240525;

public class MyStringBuilder {
    private char[] arr;
    private int oldLength;

    public MyStringBuilder append(char ch) {
        newChar();
        arr[oldLength] = ch;
        return this;
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void newChar() {
        char[] arr = new char[oldLength + 1];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = this.arr[i];
        }
        arr[arr.length-1] = ' ';
        this.arr = arr;
    }
}
