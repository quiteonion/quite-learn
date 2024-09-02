package B20240902.Test2;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //查找一个文件夹内部有没有存在 .avi 结尾的文件，如果有则输出
        String s = "D:\\idea\\idea 存储\\quite\\src\\B20240902\\Test2\\aaa";
        File file = new File(s);
        String[] list = file.list();
        for (String string : list) {
            if (m(string))
                System.out.println(string);
        }
    }
    public static boolean m(String name){
        if (name.endsWith("avi")){
            return true;
        }
        return false;
    }
}
