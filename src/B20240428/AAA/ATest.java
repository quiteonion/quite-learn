package B20240428.AAA;

public class ATest implements A{
    public void pp(A a){
        a.play();
    }
    @Override
    public void play() {
        System.out.println("00000");
    }
}
