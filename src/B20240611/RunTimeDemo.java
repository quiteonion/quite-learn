package B20240611;

import java.io.IOException;

public class RunTimeDemo {
    public static void main(String[] args) throws IOException {
//        Runtime runtime = new Runtime();
        Runtime runtime = Runtime.getRuntime();
        System.out.println("CPU 线程数： " + runtime.availableProcessors());
        System.out.println("JVM 能从系统中获取的总内存的大小： " + runtime.maxMemory() + " size = " + runtime.maxMemory() / 1024 + " KB = " + runtime.maxMemory() / 1024 / 1024 + " MB");
        System.out.println("JVM 已经从系统中获取的总内存的大小： " + runtime.totalMemory() + " size = " + runtime.totalMemory() / 1024 + " KB = " + runtime.totalMemory() / 1024 / 1024 + " MB");
        System.out.println("JVM 剩余内存的大小： " + runtime.freeMemory() + " size = " + runtime.freeMemory() / 1024 + " KB = " + runtime.freeMemory() / 1024 / 1024 + " MB");
        /**
         * shutdown
         * 加上参数才能关机
         * -s 默认在1分钟之后关机
         * -s -t 指定关机时间（秒钟）
         * -a 取消关机操作
         * -r 关机并重启
         */
        //shutdown -s -t 120
        //两分钟后关机
        runtime.exec("shutdown");
        runtime.exit(0);
    }
}
