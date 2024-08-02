package A20240802.thread_mothed;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("正处理中....");
        Thread.sleep(5000);
        System.out.println("处理完成");
    }
}
