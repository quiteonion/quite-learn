package B20240915.Text1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("src/B20240915/Text1/File1.txt");
//        FileOutputStream fos = new FileOutputStream("src/B20240915/Text1/File2.txt");
//
//        int read ;
//        while ((read = fis.read()) != -1) {
//            fos.write(read + 128);
//        }
//        fis.close();
//        fos.close();



        FileInputStream fis1 = new FileInputStream("src/B20240915/Text1/File2.txt");
        FileOutputStream fos1 = new FileOutputStream("src/B20240915/Text1/File3.txt");

        int read1 ;
        while ((read1 = fis1.read()) != -1) {
            fos1.write(read1 - 128);
        }
        fis1.close();
        fos1.close();
    }
}
