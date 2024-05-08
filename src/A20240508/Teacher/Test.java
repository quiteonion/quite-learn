package A20240508.Teacher;

public class Test {
    public static void main(String[] args) {
//        Animal a = new Animal();
        Person p = new Person("Coke");
        Cat c = new Cat("小猫");
        p.feeding(c);
        c.play();
    }
}
