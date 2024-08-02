package B20240802;

public class ThreadTest2 {
    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        threadDemo1.start();
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        new Thread(threadDemo2).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("This is " + Thread.currentThread().getName() + " - " + i);
                }
            }
        }).start();
    }
}
class ThreadDemo1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is " + Thread.currentThread().getName() + " - " + i);
        }
    }
}

class ThreadDemo2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is " + Thread.currentThread().getName() + " - " + i);
        }
    }
}