package B20240902.test3;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        //查找一个文件夹内部有没有存在 .avi 结尾的文件，如果有则输出（包含子级文件夹）
        String s = "D:\\idea\\idea 存储\\quite\\src\\B20240902\\test3\\movieInHere";
        File f = new File(s);
        m(f);
    }

    public static void m(File name) {
        String[] list = name.list();
        for (String s : list) {
            File file = new File(name,s);
            if (file.isFile()){
                if (file.getName().endsWith(".avi")) {
                    System.out.println(file.getName());
                }
            }
            if (file.isDirectory()) {
                m(file);

            }
        }
    }
}
