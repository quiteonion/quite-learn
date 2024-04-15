package B20240413.Test0;

public class Person extends Animal{
    private String name;

    public Person() {
    }

    public Person(String name , int age) {
        super(age);
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  /*  public void keepPet(Pet p , String something){
        p.eat(p , something);
    }*/
/*    public void keepPet(Dog d, String something){
        System.out.println(getAge()+"的"+this.name);
        d.eat(something);
    }
    public void keepPet(Cat c, String something){
        System.out.println(getAge()+"的"+this.name);
        c.eat(something);
    }*/
  public void keepPet(Pet p ,String something) {
      if (p instanceof Dog) {
          System.out.println(p.getAge() + "的" + p.getColor() + "狗正在吃" + something);
      } else if (p instanceof Cat) {
          System.out.println(p.getAge() + "的" + p.getColor() + "猫正在吃" + something);
      }
  }
}
