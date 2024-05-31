package A20240531;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AboutCollection {
    public static void main(String[] args) {
        Collection<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        System.out.println(arr);

        System.out.println("=== === ===");

        if (arr instanceof ArrayList<String> arrayList){
            Iterator<String> iterator = arrayList.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
            for (; ; ){
                System.out.println("=== === ===");
            }
        }
    }
}
