package B20240902.test5;

import java.io.File;

public class Test5 {
    static int java = 0;
    static int txt = 0;
    static int png = 0;
    static int md = 0;
    static int other = 0;

    public static void main(String[] args) {
        String s = "D:\\idea\\idea 存储\\quite\\src";
        File f = new File(s);
        m(f);
        System.out.println("java - " + java);
        System.out.println("txt - " + txt);
        System.out.println("png - " + png);
        System.out.println("md - " + md);
        System.out.println("other - " + other);
    }

    public static void m(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                if (f.getName().endsWith(".java"))
                    java++;
                else if (f.getName().endsWith(".txt"))
                    txt++;
                else if (f.getName().endsWith(".png"))
                    png++;
                else if (f.getName().endsWith(".md"))
                    md++;
                else
                    other++;
            }
            if (f.isDirectory()) {
                m(f);
            }
        }
    }
}
