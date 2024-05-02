package B20240502.Test5;

public class Main {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.NonStaticInnerClass n = new OuterClass().new NonStaticInnerClass();
        n.setI(60);
        n.getI();
    }
}
