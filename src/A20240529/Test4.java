package A20240529;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("src/A20240512");
        String n = "--";
        disFile(file, n);
    }

    private static void disFile(File file, String n) {
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                System.out.println(n + files[i].getName());
                disFile(files[i], n + "--");
            } else {
                System.out.println(n + files[i].getName());
            }
        }
    }


}
