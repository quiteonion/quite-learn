package B20240806.map_demo.map_test.Student;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String origin;

    public Student(String name, int age, String origin) {
        this.name = name;
        this.age = age;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAge() == student.getAge() && Objects.equals(getName(), student.getName()) && Objects.equals(getOrigin(), student.getOrigin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getOrigin());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", origin='" + origin + '\'' +
                '}';
    }
}
