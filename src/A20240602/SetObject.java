package A20240602;

import java.util.*;

public class SetObject {
    public static void main(String[] args) {
        Set<Student> arr = new HashSet<>();
        arr.add(new Student("1", 1));
        arr.add(new Student("2", 2));
        arr.add(new Student("3", 3));

        arr.add(new Student("3", 3));
        System.out.println(arr.size());
        System.out.println(arr);
        System.out.println("=== === === ===");
        System.out.println(arr.contains(new Student("3", 3)));

    }
}

class Student  {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student student) {
                return this.name.equals(student.name) && this.age == student.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
