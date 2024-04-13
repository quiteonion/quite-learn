package B20240413.Test0;

public class Pet extends Animal{
    private String color;

    public Pet() {
    }

    public Pet(String color , int age) {
        super(age);
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor( String color) {
        this.color = color;
    }
    public void eat(Pet p ,String something){
        if (p instanceof Dog){
            System.out.println(p.getAge()+"的"+p.getColor()+"狗正在吃"+something);
        }else if (p instanceof Cat){
            System.out.println(p.getAge()+"的"+p.getColor()+"猫正在吃"+something);
        }
    }
}
