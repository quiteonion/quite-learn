package A20240602;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AboutSet {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("c");
        arrayList.add("d");
        System.out.println(arrayList);
        System.out.println("=== === ===");
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("b");
        set.add("b");
        set.add("b");
        set.add("b");
        set.add("b");
        set.add("c");
        set.add("c");
        set.add("c");
        set.add("d");
        set.add("d");
        System.out.println(set);
    }
}

