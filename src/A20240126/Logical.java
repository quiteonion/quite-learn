package A20240126;

public class Logical {
    public static void main(String[] args) {
        //逻辑或和逻辑与通常出现在选择中，作用就是选择
        /*
        相同点1：& 与 && 的运算结果相同
        相同点2：当符号左边是true时，二者都会执行符号右边的运算

        不同点：当符号左边是false时，&继续执行符号右边的运算。&&不再执行符号右边的运算。

        推荐使用 &&
         */
        boolean b1 = true;
        //b1 = false;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("厦门");
        } else {
            System.out.println("福州");
        }
        System.out.println("num1 = " + num1);


        boolean b2 = true;
        //b2 = false;
        int num2 = 10;
        if (b2 && (num2++ > 0)) {
            System.out.println("厦门");
        } else {
            System.out.println("福州");
        }
        System.out.println("num2 = " + num2);

        // | vs ||
        /*
        相同点1：| 与 || 的运算结果相同
        相同点2：当符号左边是false时，二者都会执行符号右边的运算

        不同点：当符号左边是true时，| 继续执行符号右边的运算，而 || 不再执行符号右边的运算

        推荐使用 ||
         */
        boolean b3 = false;
        b3 = true;
        int num3 = 10;
        if (b3 | (num3++ > 0)) {
            System.out.println("厦门");
        } else {
            System.out.println("福州");
        }
        System.out.println("num3 = " + num3);


        boolean b4 = false;
        //b4 = true;
        int num4 = 10;
        if (b4 || (num4++ > 0)) {
            System.out.println("厦门");
        } else {
            System.out.println("福州");
        }
        System.out.println("num4 = " + num4);










        //test1();
        //test2();
        //test3();
        test4();
    }

    public static void test1() {
        int x = 1;
        int y = 1;
        if (x++ == 2 & ++y == 2) {
            x = 7;
        }
        /*
        x=2,y=2
         */
        System.out.println("x=" + x + ",y=" + y);
    }

    public static void test2() {
        int x = 1, y = 1;
        if (x++ == 2 && ++y == 2) {
            x = 7;
        }
        /*
        x=2,y=1
         */
        System.out.println("x=" + x + ",y=" + y);
    }

    public static void test3() {
        int x = 1, y = 1;
        if (x++ == 1 | ++y == 1) {
            x = 7;
        }
        /*
        x=7,y=2
         */
        System.out.println("x=" + x + ",y=" + y);
    }

    public static void test4() {
        int x = 1, y = 1;
        if (x++ == 1 || ++y == 1) {
            x = 7;
        }
        /*
        x=7,y=1
         */
        System.out.println("x=" + x + ",y=" + y);
    }
}
