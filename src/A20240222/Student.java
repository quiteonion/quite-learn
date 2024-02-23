package A20240222;

public class Student {
    private String name;
    private int age;
    private String grade;

    public Student() {
    }

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getGrade(){
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void displayInfo(){
        System.out.println("姓名   年龄   年级");
        System.out.print(this.getName()+"   ");
        System.out.print(this.getAge()+"    ");
        System.out.print(this.getGrade()+"   ");
    }
    public void Syudy(){
        System.out.println("学生正在玩耍");
    }
    public void sleep(){
        System.out.println("学生正在睡觉");
    }
}
