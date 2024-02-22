package A20240222;

public class Dog {
    private String name;
    private int id;
    private String color;

    public Dog() {
    }

    public Dog(String name, int id, String color) {
        this.name = name;
        this.id = id;
        this.color = color;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public void show(){
        if (this.id == 001){
            System.out.println("洞洞妖在执行任务!!");
        }else{
            System.out.println("它在刨土...");
        }
    }
}
