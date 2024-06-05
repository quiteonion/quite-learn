package A20240605;

public class Test4 {
    public static void main(String[] args) {
        /**
         * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
         * 例外事件
         * 堆爆满
         */
        String[] arr = new String[(int)(Math.pow(1024,3))];
    }
}
