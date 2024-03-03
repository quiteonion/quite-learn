package A20240303;

public class StudentAA {
    Dog dog = new Dog();
    private String name;
    private int age;
    private int id;

    public StudentAA() {
    }

    public StudentAA(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    public void StudentHaveDog_Student() {
        System.out.println("名字   年龄   编号");
        System.out.println(this.name + "  " + this.age + "  " + this.id);
        StudentHaveDog_Dog();
    }

    public void StudentHaveDog_Dog() {

    }
}

