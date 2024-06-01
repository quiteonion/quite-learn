package B20240601;

public class Student {
    private String name;
    private int age;
    private int id;
    private static int i;
    private String className;

    static {
        i  = 1;
    }
    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
        id  = i;
        i++;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student student) {
            return student.name.equals(this.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return " 姓名 " + this.name + " 年龄 " + this.age + " id " + getId() + " 班级 " + this.className;
    }
}
