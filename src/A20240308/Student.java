package A20240308;

public class Student {
    private static Student instance;
    private String name;
    private int age;

    private Student() {

    }


    /**
     * 获取
     * @return s
     */
    public static final Student instanceAA() {
        if (instance == null)
        instance = new Student();
        return instance;
    }

    /**
     * 设置
     * @param s
     */

   /* public static student getS() {
       student s = new student();
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


}
