package B20240413.Test0;

public class Cat extends Pet{
    public Cat(int age , String color){
        super( color , age);
    }
    public void eat(String something){
        System.out.println("猫正在吃");
    }
    public void catchMouse(){
        System.out.println("猫子在抓老鼠");
    }
}
