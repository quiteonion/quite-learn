package A20240802;

public class SynchronizedDemo {
    public static void main(String[] args) {
        m1();
         new Thread(new Runnable() {
            @Override
            public void run() {
                new SynchronizedDemo().m2();
            }
        }).start();

    }
    public static synchronized void m1(){
        System.out.println("Synchronized.m1");
        synchronized(SynchronizedDemo.class){
            System.out.println("1241515");
        }
    }
    public void m2(){
        System.out.println("Synchronized.m2");
        synchronized(this){
            System.out.println("1241515");
        }
        System.out.println(" == == == ");
    }
}
