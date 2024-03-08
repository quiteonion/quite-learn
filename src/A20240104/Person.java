package A20240104;

public class Person {
    /*题目：编写一个Java程序，实现以下功能：

    定义一个名为Person的类，包含以下属性：姓名（name）、年龄（age）和性别（gender）。
    为Person类编写构造方法，用于初始化属性值。
    为Person类编写getter和setter方法，用于获取和设置属性值。
   */
    private String name;
    private int age;
    private String gender;


    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //定义空参和全参


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


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
