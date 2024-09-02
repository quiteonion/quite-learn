package B20240902.test4;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
//        删除改包下的aaa文件夹，包括它的子级文件夹
        String s = "D:\\idea\\idea 存储\\quite\\src\\B20240902\\test4\\aaa";
        File file = new File(s);
        m(file);
    }
    public static void m(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                f.delete();
            }else {
                m(f);
            }
            f.delete();
        }
    }
}
