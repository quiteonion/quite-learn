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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getDogs() {
        return dogs;
    }

    public void setDogs(String dogs) {
        this.dogs = dogs;
    }


}
