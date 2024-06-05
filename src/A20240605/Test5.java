package A20240605;

public class Test5 {
    public static void main(String[] args) {
        /**
         * Exception in thread "main" : Cannot load from int array because "i[0]" is null
         * 例外事件
         * 访问空指针
         */
        int[][] i = new int[2][];
        System.out.println(i[0][0]);
    }
}
