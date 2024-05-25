package A20240223;

public class Student {
    private String name;
    private int id;
    private int age;

    public Student() {
    }

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0){
            System.out.println("输入有误");
            System.exit(-1);
        }else
            this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (id <= 0){
            System.out.println("输入有误");
            System.exit(-1);
        }else
            this.age = age;
    }

}
