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
    public void keepPet(Pet p , String something){
        p.eat(p , something);
    }
}
