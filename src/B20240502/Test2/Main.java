package B20240502.Test2;

public class Main {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.getprintStaticValue();
        OuterClass.setSic("ngmaaiyo");
        OuterClass.getprintStaticValue();
        oc.getNonStaticInnerClass(70);
    }
}
