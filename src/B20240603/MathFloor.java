package B20240603;

public class MathFloor {
    public static void main(String[] args) {
        /**
         * floor
         * 与 ceil 相反，向下取整大地板
         * 只要小数点后面跟着东西，就直接向下取整
         */
        System.out.println(Math.floor(23.000000000001));
        System.out.println(Math.floor(23.999999999999));
    }
}
