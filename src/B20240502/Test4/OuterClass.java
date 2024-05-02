package B20240502.Test4;

public class OuterClass{
    public interface MyInterface {
        void performAction();
    }

    public void useAnonymousInnerClass(){
        new MyInterface(){
            @Override
            public void performAction() {
                System.out.println("匿名内部类的重写");
            }
        }.performAction();
    }
}
