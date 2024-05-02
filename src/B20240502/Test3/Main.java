package B20240502.Test3;

public class Main {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        OuterClass.getprintStaticValue();
        OuterClass.setSic("ngmaaiyo");
        OuterClass.getprintStaticValue();
        oc.getNonStaticInnerClass(70);
        oc.uesLocalInnerClass();
    }
}
