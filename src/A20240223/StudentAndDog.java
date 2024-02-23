package A20240223;

public class StudentAndDog {
    Student student = new Student();
    private String dogs;

    public StudentAndDog() {
    }

    public StudentAndDog(Student student, String dogs) {
        this.student = student;
        this.dogs = dogs;
    }

    /**
     * 获取
     * @return student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * 设置
     * @param student
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * 获取
     * @return dogs
     */
    public String getDogs() {
        return dogs;
    }

    /**
     * 设置
     * @param dogs
     */
    public void setDogs(String dogs) {
        this.dogs = dogs;
    }


}
