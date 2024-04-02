package B20240402;

class a{
    private String type;
    private int velocity;

    public a() {
    }

    public a(String type, int velocity) {
        this.type = type;
        this.velocity = velocity;
    }

    /**
     * 获取
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * 设置
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取
     * @return velocity
     */
    public int getVelocity() {
        return velocity;
    }

    /**
     * 设置
     * @param velocity
     */
    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void move(int velocity){
        if (velocity > this.velocity){
            System.out.println("已经减速到该速度");
        }else if (velocity < this.velocity){
            System.out.println("已经加速到该速度");
        }else {
            System.out.println("速度恒定");
        }
    }
}
public class Car {
    public static void main(String[] args) {
        a a = new a("宝马",100);
        a.move(20);
        a.move(120);
    }
}
