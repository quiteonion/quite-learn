package B20240413.Test0;

public class Cat extends Pet{
    public Cat(int age , String color){
        super( color , age);
    }
    @Override
    public void eat(Pet p, String something) {
        super.eat(p, something);
    }
}
