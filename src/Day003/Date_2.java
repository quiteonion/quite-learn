package Day003;

public class Date_2 {
    public static void main(String[] args) {
        /*
        存在损失
         */
        double a1 = 19.9;
        int i1 = (int)a1;
        System.out.println(i1);

        /*
        没有损失
         */
        long l1 = 121;
        short s1 = (short)l1;
        System.out.println(s1);

        /*
        有损失
         */
        int i2 = 128;
        byte b1 = (byte)i2;
        System.out.println(b1);
        /**
         * 由上可得
         * 在Java的强子转换中，会有可能产生损失
         */


        //float f2 = 19.9;
        //short s2 = 12;
        //byte b3 = 12;
        //long l2 = 21412412844;
        /**
         * 以上都错误了错误原因就是
         * 浮点数默认为 double 类型
         * 整型默认为 int 类型
         */
        /**
         * 在进行运算时，也遵循以上法则
         */
    }
}
