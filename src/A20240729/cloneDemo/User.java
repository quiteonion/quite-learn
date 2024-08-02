package A20240729.cloneDemo;

import java.util.Arrays;

public class User implements Cloneable {
    String name;
    int age;
    int[] arr;
    public User(String name, int age, int[] arr) {
        this.name = name;
        this.age = age;
        this.arr = arr;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        int[] clone = this.arr.clone();
        User clone1 = (User) super.clone();
        clone1.arr = clone;
        return clone1;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
