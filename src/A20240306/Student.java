package A20240306;

public class Student {
    String name;
    int id;
    int age;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int id) {
        this.id = id;
    }
    public Student(String name , int id ){
        this.name = name;
        this.id = id;
    }
    public Student(String name , int id , int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
}
