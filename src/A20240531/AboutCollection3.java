package A20240531;

import java.util.ArrayList;

public class AboutCollection3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        System.out.println(arr.contains("2"));
        System.out.println("=== === ===");

        ArrayList<Student> arr1 = new ArrayList<>();
        arr1.add(new Student("a" , 18));
        arr1.add(new Student("b" , 19));
        arr1.add(new Student("c" , 20));
        System.out.println(arr1.contains(new Student("b" , 19)));

    }
}
class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    }

