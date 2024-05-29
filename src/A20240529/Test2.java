package A20240529;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File f1 = new File("src/A20240529");
        System.out.println( f1.toString() );
        System.out.println( f1.getName() );
        System.out.println( f1.isFile() );
        System.out.println( f1.isDirectory() );
        String[] list = f1.list();
        System.out.println(list);

        System.out.println("=== === ===");

        File f2 = new File("src/A20240529/Test.java");
    }
}
