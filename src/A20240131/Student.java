package A20240131;

public class Student {
    private String name;
    private int age;
    private char sex;
    private String image;

    public Student(){
    }

    public Student(String name, int age, char sex, String image) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.image = image;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public void attr(Student student){
        System.out.println(getName()+"爱上了"+student.getName());
    }
}
