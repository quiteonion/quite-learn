package A20240524;

public class WrapperInterview {
    public static void main(String[] args) {
        q1();
        System.out.println("=== === ===");
        q2();
        System.out.println("=== === ===");
        q3();
        System.out.println("=== === ===");
    }

    private static void q1() {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);
    }

    private static void q2() {
        Integer i1 = 1;
        Integer i2 = 1;
        System.out.println(i1 == i2);
    }

    private static void q3() {
        Integer i1 = 222;
        Integer i2 = 222;
        System.out.println(i1 == i2);
    }
}
