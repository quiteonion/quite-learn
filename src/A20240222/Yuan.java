package A20240222;

public class Yuan {
    private double r;
    static double pl = 3.141;

    public Yuan() {
    }

    public Yuan(double r, double pl) {
        this.r = r;
        this.pl = pl;
    }

    /**
     * 获取
     * @return pl
     */
    public static double getPl() {
        return pl;
    }

    /**
     * 设置
     * @param pl
     */
    public static void setPl(double pl) {
        Yuan.pl = pl;
    }

    /**
     * 获取
     * @return r
     */
    public double getR() {
        return r;
    }

    /**
     * 设置
     * @param r
     */
    public void setR(double r) {
        this.r = r;
    }

    public double MianJi(){
        double s = this.r*this.r*pl;
        return s;
    }
    public double ZhouChang(){
        double c = this.r*pl;
        return c;
    }
}
