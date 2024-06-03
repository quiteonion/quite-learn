package B20240603;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-3247061002160697142L));
        /**
         * 但是会有一个小bug：
         *  int 为例
         * int ： -2147483648 ~ 2147483647
         * 如果没有正数与负数对应，那么结果会有错误
         * 比如 -2147483648 没有正数与之对应，所以就会产生没有输出正数的状态
         */
        //这个时候，JDK 就提供了另一个方法： absExact
        //源码中 ， 他会判断,如果是最大值，则会返回错误
        /**
         * ````Java
         *     public static long absExact(long a) {
         *         if (a == Long.MIN_VALUE)
         *             throw new ArithmeticException(
         *                 "Overflow to represent absolute value of Long.MIN_VALUE");
         *         else
         *             return abs(a);
         *     }
         * ````
         */
        System.out.println(Math.absExact(-1213135678L));

    }
}
