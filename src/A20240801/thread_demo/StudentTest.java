package A20240801.thread_demo;

public class StudentTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Student.getInstance());
                }
            }).start();
        }
    }
}
