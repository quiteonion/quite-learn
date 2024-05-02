package B20240502.Test1;

public class OuterClass {
    static StaticInnerClass sic = new StaticInnerClass();
    public static void setSic(String value){
        StaticInnerClass.staticValue = value;
    }
    public static void getprintStaticValue(){
        sic.printStaticValue();
    }

    private static class StaticInnerClass {
        private static String staticValue = "成员内部类的练习1";

        public void printStaticValue() {
            System.out.println(staticValue);
        }
    }

}
