package A20240508.Teacher;

public class Cat extends Animal {
    public  Cat(String name ){
        super(name);
    }

    @Override
    public void newAbstractMethod() {

    }

    public void play(){
        System.out.println("小猫又跑又跳");
    }
}
