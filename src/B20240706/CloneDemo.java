package B20240706;

import java.util.Arrays;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User("a",12,new int[]{1,2,3,45,});

        User user2 = (User) user1.clone();
        System.out.println(user1);
        System.out.println(user2);
    }
}
class User implements Cloneable{
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", aa=" + Arrays.toString(aa) +
                '}';
    }
}
