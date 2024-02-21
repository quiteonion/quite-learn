package Job20240216Over;

public class Table99 {
    public static void main(String[] args) {
        /*关于如何书写一个九九乘法表*/
        //九九乘法表结构为
        /**
         * 1*1
         * 2*1  2*2
         * 3*1  3*2  3*3
         * .。。。。。
         * 。。。
         * 。。
         * 。
         */
        //自然可以选择使用”直接显示法“
        /*System.out.println("1*1=2");
        System.out.println("1*2=2  2*2=4");
        System.out.println("1*3=3  2*3=6  3*3=9");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");*/

        //但是明显，这种方式太笨，属于吃力不讨好型，于是我们进行观察
        /**
         * 1、九九乘法表中每一个算数式都存在两个数值
         * 2、九九乘法表的形状是一个直角三角形
         * 3、九九乘法表可以看作一个二维体
         */

        //由以上观察结论我们得知九九乘法表似乎是由一个或者多个循环组成的  可得
       /* for (int i = 0; i < ; i++) {
            System.out.println(i);
        }*/
        //但是一个循环所能得到的只是一条直线（竖向或横向）
        //是故我们需要两个循环的叠加使用  如下
        /*for (int i = 0; i <; i++) {
            for (int j = 0; j <; j++) {
                System.out.println(i);
            }
        }*/

        //然后就是两个循环所需要的结束条件，通过观察九九乘法表的外观简略得到大概需要循环九次

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        //稍加改进让他展现出二维
    }
}
