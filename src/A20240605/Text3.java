package A20240605;

public class Text3 {
    public static void main(String[] args) {
        /**
         * Exception in thread "main" java.lang.StackOverflowError
         * 例外事件
         * 栈爆满
         */
        m();
    }
    public static void m(){
        m();
    }
}
