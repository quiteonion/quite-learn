package B20240707;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        //BigInteger 内部为我们提供了许多可以使用的方法
        BigInteger i1 = BigInteger.valueOf(10);
        BigInteger i2 = BigInteger.valueOf(5);

        //加法
        System.out.println(i1.add(i2));
        //减法
        System.out.println(i1.subtract(i2));
        //乘法
        System.out.println(i1.multiply(i2));
        //除法
        System.out.println(i1.divide(i2));
        //除法，获取商和余数
        BigInteger[] b1 = i1.divideAndRemainder(i2);
        System.out.println(b1[0]);
        System.out.println(b1[1]);
    }
}
