package A20240529;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Test3 {
    static int NULL = 0;
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        //获取文件目录
        File file = new File("src");
        //转变为数组，内部为 File 则提取后缀 ， 如果不是则递归
        disArr(file);
        System.out.println(map);
    }

    public static void disArr(File file) {
        File[] arr = file.listFiles();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isDirectory()){
                disArr(arr[i]);
            }else {
                String Allname = arr[i].getName();
                Integer j = Allname.lastIndexOf(".");
                String name = Allname.substring(j);
                if (map.containsKey(name)){
                    map.put(name , map.get(name)+1);
                }else {
                    map.put(name , 1);
                }
            }
        }
    }
}

