package B20240502.Test5;

public class OuterClass {
    private int i;

    public class NonStaticInnerClass {
        public void setI(int i) {
            OuterClass.this.i = i;
        }

        public void getI() {
            System.out.println(i);
        }
    }

}
