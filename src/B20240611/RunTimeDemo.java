package B20240611;

public class RunTimeDemo {
    public static void main(String[] args) {
//        Runtime runtime = new Runtime();
        Runtime runtime = Runtime.getRuntime();
        System.out.println("CPU 线程数： " + runtime.availableProcessors());
        System.out.println("JVM 能从系统中获取的总内存的大小： " + runtime.maxMemory() + " size = " + runtime.maxMemory() / 1024 + " KB = " + runtime.maxMemory() / 1024 / 1024 + " MB");
        runtime.exit(0);
    }
}
