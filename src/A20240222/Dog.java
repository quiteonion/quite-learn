package A20240222;

public class Dog {
    String name;
    int id;
    String color;

    public Dog(String name , int id , String color) {
        this.name = name;
        this.id = id;
        this.color = color;
    }


    public void show() {
        if (this.id == 001) {
            System.out.println("洞洞妖在执行任务!!");
        } else {
            System.out.println("它在刨土...");
        }
    }
}
