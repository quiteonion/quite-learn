package A20240508.TestPack;
import A20240508.TestPack.sum100;

public abstract class ComputeTime {
    public abstract void Algorithm();
    public static long whatTime(ComputeTime computeTime){
        long begin = System.currentTimeMillis();
        long time;
        computeTime.Algorithm();
        long end = System.currentTimeMillis();
        time = end-begin;
        return time;
    }
}
class Test extends ComputeTime{
    @Override
    public void Algorithm() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }

}
class Main{
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(ComputeTime.whatTime(t));
    }
}
