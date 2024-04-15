package B20240413.Test0;

public class Cat extends Pet{
    public Cat(int age , String color){
        super( color , age);
    }
    public void catchMouse(){
        System.out.println("猫子在抓老鼠");
    }
}
