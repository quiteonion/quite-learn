package A20240324.Teacher;

public class Cat extends Animal{
    public  Cat(String name ){
        super(name);
    }
    public void set(String name){
        super.name = name;
    }
    public void play(){
        System.out.println("小猫又跑又跳");
    }
}
