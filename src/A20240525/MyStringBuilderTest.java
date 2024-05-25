package A20240525;

public class MyStringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        MyStringBuilder msb = new MyStringBuilder();
        msb.append('d');
        msb.print();
    }
}
