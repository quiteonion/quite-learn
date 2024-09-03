package B20240903;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyIODemo1 {
    public static void main(String[] args) {
        //IO 流的简称便是读取流，和输出流
        //我们可以通过 new 出一个 FileInputStream 来获取文件夹中对应的输入流  ↓
        FileInputStream fis1 = new FileInputStream("src/B20240903/inputFile/inputTxt.txt");
        //当然，也可以通过 new 出一个 FileOutputStream 来写入想要写入的内容  ↓
        //这里会存在编译时报错，为了提醒你现在是否将文件名称填写正确了
        FileOutputStream fos1 = new FileOutputStream("src/B20240903/outFile/outputTxt.txt");
        /**
         * 在两个构造方法的形参中同时拥有第二个参数，这个参数的作用是 是否在上一次的基础上继续向下书写
         */
    }
}
