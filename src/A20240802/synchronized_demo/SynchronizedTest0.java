package A20240802.synchronized_demo;

import javax.print.DocFlavor;

public class SynchronizedTest0 {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock1) {
                    System.out.println("===");
                    synchronized (lock2) {
                        System.out.println("===");
                    }
                }
            }
        });Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock2) {
                    System.out.println("===");
                    synchronized (lock1) {
                        System.out.println("===");
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
