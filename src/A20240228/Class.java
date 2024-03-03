package A20240228;

public class Class {
    Student student = new Student();
    private int number;

    public Class() {
    }

    public Class( int number) {
        this.number = number;
    }

    /**
     * 获取
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

}
