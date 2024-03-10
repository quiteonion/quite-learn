package A20240308;

public class Student {

    private static Student s = new Student();
    private String name;
    private int age;

    private Student() {

    }

    public Student(Student s, String name, int age) {
        this.s = s;
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return s
     */
    public static Student getS() {
        return s;
    }

    /**
     * 设置
     * @param s
     */
    public static void setS(Student s) {
        Student.s = s;
    }
   /* public static Student getS() {
       Student s = new Student();
        return s;
    }
*/

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

    public String toString() {
        return "Student{s = " + s + ", name = " + name + ", age = " + age + "}";
    }
}
