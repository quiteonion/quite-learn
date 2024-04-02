package B20240402;

class MyTime {
    private int hour = 8;
    private int min = 25;
    private int sec = 30;

    public MyTime() {
    }


    /**
     * 获取
     * @return hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * 设置
     * @param hour
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * 获取
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 获取
     * @return sec
     */
    public int getSec() {
        return sec;
    }

    /**
     * 设置
     * @param sec
     */
    public void setSec(int sec) {
        this.sec = sec;
    }


    public void addHour(int hour){
        this.hour += hour;
    }

    public void addMin(int min){
        this.min += min;
    }

    public void addSec(int sec){
        this.sec += sec;
    }

    public void subHour(int hour){
        this.hour += hour;
    }

    public void subMin(int min){
        this.min += min;
    }

    public void subSec(int sec){
        this.sec += sec;
    }

}
public class MyTimeTest{
    public static void main(String[] args) {
        MyTime mt = new MyTime();
        System.out.println("Hour\t"+"Min\t"+"Sec");
        System.out.println(mt.getHour()+"\t"+mt.getMin()+"\t"+mt.getSec());

        mt.addHour(1);
        mt.addMin(2);
        mt.addSec(10);
        System.out.println("Hour\t"+"Min\t"+"Sec");
        System.out.println(mt.getHour()+"\t"+mt.getMin()+"\t"+mt.getSec());
    }
}
