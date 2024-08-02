package B20240802;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println(Thread.currentThread().getName());
        System.out.println("2");
        Thread.currentThread().setName("new Thread");
        System.out.println("3");
        System.out.println(Thread.currentThread().getName());

    }
}
