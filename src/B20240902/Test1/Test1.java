package B20240902.Test1;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //在当前模块下的 aaa 文件夹中创建一个 a.txt 文件
        String f = "D:\\idea\\idea 存储\\quite\\src\\B20240902\\Test1\\aaa\\a.txt";
        File file = new File(f);
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
    }
}
