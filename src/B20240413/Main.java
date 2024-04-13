package B20240413;

public class Main {
    public static void main(String[] args) {
        Fu f = new Zi("1", 2);
        System.out.println(f.getName());
        Zi z =(Zi) f;
        System.out.println(z.getAge());
    }
}

class Fu {
    String name;

    public Fu() {
    }

    public Fu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Zi extends Fu {
    int age;

    public Zi() {
    }

    public Zi(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
