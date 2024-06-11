package B20240611;

public class RunTimeDemo {
    public static void main(String[] args) {
//        Runtime runtime = new Runtime();
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        runtime.exit(0);
    }
}
