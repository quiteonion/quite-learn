package B20240806.map_demo.map_test.Student;

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

}
