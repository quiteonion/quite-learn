package B20240915.Text0;

import java.io.*;

public class Demo0 {
    public static void main(String[] args) throws IOException {
        File fis = new File("src/B20240915/Text0/q");
        File fos = new File("src/B20240915/Text0/a");

        m(fis, fos);
    }

    private static void m(File fis, File fos) throws IOException {
        fos.mkdirs();
        File[] files = fis.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                FileInputStream f1 = new FileInputStream(file);
                FileOutputStream f2 = new FileOutputStream(new File(fos, file.getName()));

                int l;
                while ((l = f1.read()) != -1) {
                    f2.write(l);
                }

                f1.close();
                f2.close();
            } else {
                m(file, new File(fos, file.getName()));
            }
        }
    }
}
