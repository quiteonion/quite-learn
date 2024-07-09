package B20240709;

public class Clone {
    public static void main(String[] args) {

    }
}
class User implements Cloneable {
    String name;
    int age;
    int[] aa;

    public User(String name, int age, int[] aa) {
        this.name = name;
        this.age = age;
        this.aa = aa;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}