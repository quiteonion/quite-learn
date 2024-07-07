package B20240707;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo {
    public static void main(String[] args) {
        /*
        public BigInteger(int num, Random rnd)          获取随机大整数，范围: [0 ~ 2的 num 次方-1]
        public BigInteger(String val)                   获取指定的大整数
        public BigInteger(String val, int radix)        获取指定进制的大整数

        public static BigInteger valueOf(long val)      静态方法获取 BigInteger 的对象， 内部有优化细节： 对象一旦创建就无法被改变
         */

        BigInteger i1 = new BigInteger(2,new Random());
        System.out.println(i1);

        System.out.println("=== === ===");

        BigInteger i2 = new BigInteger("100");
        System.out.println(i2);

        System.out.println("=== === ===");

        //radix  的意思是，这个 val 是一个几进制的数，输出统一输出 10 进制的数
        BigInteger i3 = new BigInteger("100",2);
        System.out.println(i3);

        System.out.println("=== === ===");

        BigInteger i4 = BigInteger.valueOf(100);
        System.out.println(i4);
    }
}
