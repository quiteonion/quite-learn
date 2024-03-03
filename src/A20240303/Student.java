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

}
