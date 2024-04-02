package B20240402;

class MainNumber1 {
    private int numer1;
    private int numer2;


    public MainNumber1() {
    }

    public MainNumber1(int numer1, int numer2) {
        this.numer1 = numer1;
        this.numer2 = numer2;
    }

    /**
     * 获取
     *
     * @return numer1
     */
    public int getNumer1() {
        return numer1;
    }

    /**
     * 设置
     *
     * @param numer1
     */
    public void setNumer1(int numer1) {
        this.numer1 = numer1;
    }

    /**
     * 获取
     *
     * @return numer2
     */
    public int getNumer2() {
        return numer2;
    }

    /**
     * 设置
     *
     * @param numer2
     */
    public void setNumer2(int numer2) {
        this.numer2 = numer2;
    }

    public int addition() {
        return numer1 + numer2;
    }

    public int subition() {
        return numer1 - numer2;
    }

    public int mulition() {
        return numer1 * numer2;
    }

    public int divition() {
        return numer1 / numer2;
    }

}
public class Number{
    public static void main(String[] args) {
        MainNumber1 m = new MainNumber1(1,2);
        System.out.println(m.addition());
    }
}
