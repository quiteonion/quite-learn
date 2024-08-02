package A20240801.no_thread;

public class Main {
    public static void m1(){
        m2();
        System.out.println("this is m1");
    }
    public static void m2(){
        m3();
        System.out.println("this is m2");
    }
    public static void m3(){
        System.out.println("this is m3");
    }
    public static void main(String[] args) {
        m1();
        System.out.println("Main.main");
    }
}
