package A20240802.thread_mothed;

public class ThreadIsAlive {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        });
        System.out.println(thread.isAlive());
        thread.start();
        System.out.println(thread.isAlive());
        Thread.sleep(1000);
        System.out.println(thread.isAlive());
    }
}
