package B20240502.Test2;

public class OuterClass {
    static StaticInnerClass sic = new StaticInnerClass();

    public static void setSic(String value) {
        StaticInnerClass.staticValue = value;
    }

    public static void getprintStaticValue() {
        sic.printStaticValue();
    }
    public void getNonStaticInnerClass(int i){
        NonStaticInnerClass nstic = new NonStaticInnerClass();
        nstic.setInstanceValue(i);
        nstic.printInstanceValue();
    }

    private static class StaticInnerClass {
        private static String staticValue = "成员内部类的练习1";

        public void printStaticValue() {
            System.out.println(staticValue);
        }
    }
    private class NonStaticInnerClass{
        private int instanceValue;
        public void setInstanceValue(int i){
            this.instanceValue = i;
        }

        public void printInstanceValue(){
            System.out.println(instanceValue);
        }
    }

}
