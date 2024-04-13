package B20240413;

public class Test {
    public static void main(String[] args) {
        Amnimo a = new Dog();
        System.out.println(a.name);
        a.AAA();
    }
}
class Amnimo{
    String name = "Amnimo";

    public Amnimo() {
    }

    public Amnimo(String name) {
        this.name = name;
    }

    public void AAA() {
        System.out.println("Amnimo -- AAA");
    }

}
class Dog extends Amnimo {
    String name = "Dog";

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public void AAA() {
        System.out.println("Dog --- AAA");
    }
}

class Cat extends Amnimo {
    String name = "Cat";

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }
    public void AAA() {
        System.out.println("Cat --- AAA");
    }
}

