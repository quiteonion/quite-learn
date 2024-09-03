package B20240903;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyIODemo1 {
    public static void main(String[] args) throws IOException {
        //IO 流的简称便是读取流，和输出流
        //我们可以通过 new 出一个 FileInputStream 来获取文件夹中对应的输入流  ↓
        FileInputStream fis1 = new FileInputStream("src/B20240903/inputFile/inputMovie.mp4");
        //当然，也可以通过 new 出一个 FileOutputStream 来写入想要写入的内容  ↓
        //这里会存在编译时报错，为了提醒你现在是否将文件名称填写正确了
        FileOutputStream fos1 = new FileOutputStream("src/B20240903/outFile/inputMovie.mp4");
        /**
         * 在两个构造方法的形参中同时拥有第二个参数，这个参数的作用是 是否在上一次的基础上继续向下书写
         */
        int l;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((l = fis1.read(bytes)) != -1) {
            fos1.write(bytes, 0, l);
        }
        fos1.close();
        fis1.close();
    }
}
