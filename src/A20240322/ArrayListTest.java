package A20240322;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> AL = new ArrayList<>();
        AL.add("aaa");
        AL.get(0);
        AL.size();
        AL.set(0 , "bbb");
        AL.remove(0);

        System.out.println("===========================");

        System.out.println(AL.add("aaa"));
        System.out.println(AL.get(0));
        System.out.println(AL.size());
        System.out.println(AL.set(0, "bbb"));
        System.out.println(AL.remove(0));

    }
}
