package B20240802;

public class ThreadTest2 {
    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        threadDemo1.start();
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

