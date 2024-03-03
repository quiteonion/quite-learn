package A20240303;

public class Student {
    private String name;
    private int age;
    private char gender;
    private int id;

    public Student(String name, int age, char gender, int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public Student() {
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

}
