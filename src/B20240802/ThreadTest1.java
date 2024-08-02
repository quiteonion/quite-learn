package B20240802;

public class ThreadTest1 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
        Thread2 thread2 = new Thread2();
        thread2.start();
        Thread thread = new Thread(new Thread1(), "Thread3");
        thread.start();
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is " + Thread.currentThread().getName() + " - " + i);
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is " + Thread.currentThread().getName() + " + " + i);
        }
    }
}