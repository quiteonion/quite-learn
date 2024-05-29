package A20240529;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("src/A20240512");
        disFile(file);
    }

    private static void disFile(File file) {
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                returnDirName(files[i]);
                disFile(files[i]);
            }else if (files[i].isFile()){
                returnFileName(files[i]);
            }
        }
    }

    private static void returnFileName(File file) {
        System.out.println("----" + file.getName());
    }

    private static void returnDirName(File file) {
        System.out.println("--" + file.getName());
    }

}
