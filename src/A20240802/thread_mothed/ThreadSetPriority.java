package A20240802.thread_mothed;

public class ThreadSetPriority {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        });

        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }

    }
}
