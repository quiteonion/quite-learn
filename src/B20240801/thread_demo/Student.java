package B20240801.thread_demo;

public class Student {
    private static Student student;

    private Student() {
        System.out.println("=== === ===");
    }
    public static Student getInstance(){
        if (student == null) {
            student = new Student();
        }
        return student;
    }
}
