package A20240605;

public class Test {
    public static void main(String[] args) {
        /**
         * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 90 out of bounds for length 9
         * 例外事件
         * 这个数组的索引不存在
         */
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(arr[90]);
    }
}
