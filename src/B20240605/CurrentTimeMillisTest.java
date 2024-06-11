package B20240605;

public class CurrentTimeMillisTest {
    public static void main(String[] args) {
       TableNumber t = new TableNumber();
        System.out.println(t.computeTime());
    }
}
abstract class ComputeTime{
    public abstract void table();
    public long computeTime(){
        long begin = System.currentTimeMillis();
        table();
        long end = System.currentTimeMillis();
        long time = end - begin;
        return time;
    }
}
class TableNumber extends ComputeTime{
    @Override
    public void table() {
        for (int i = 0; i < 1999; i++) {
            System.out.println(i);
        }
    }
}
