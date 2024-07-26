package B20240726;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test0 {
    public static void main(String[] args) {
        /*
        List 遍历方式
         */
        List<String> arr = new ArrayList<>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");
        arr.add("ddd");

        //1. 迭代器遍历
        Iterator<String> i1 = arr.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }

        System.out.println("=== === ===");

        //2. 增强 for 遍历
        for(String i : arr){
            System.out.println(i);
        }

        System.out.println("=== === ===");

        //Lambda 迭代器
        arr.forEach((s)-> System.out.println(s));

        System.out.println("=== === ====");

        //普通 for 循环
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        System.out.println("=== === ===");

        //列表迭代器
        ListIterator<String> stringListIterator = arr.listIterator();
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());
        }
    }
}
