package A20240605;

public class Test1 {
    public static void main(String[] args) {
        /**
         * Exception in thread "main" java.lang.NumberFormatException: For input string: "dawd"
         * 例外事件
         * 数据转化异常
         */
        String i = "dawd";
        int j = 5;
        System.out.println(Integer.valueOf(i));
    }
}
