package B20240413.Test0;

public class Dog extends Pet{
    public Dog(int age , String color){
        super( color , age);
    }

    public void eat(String something){
        System.out.println("狗正在吃");
    }
    public void lookHome(){
        System.out.println("狗子在看家");
    }
}
