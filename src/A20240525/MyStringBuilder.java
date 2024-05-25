package A20240525;

public class MyStringBuilder {
    private char[] arr;
    private int oldLength = 0;

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
    public void newChar(){
        char[] arr = new char[oldLength+1];
        this.arr = arr;
    }
}
