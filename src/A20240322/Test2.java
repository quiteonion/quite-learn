package A20240322;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Elfs> AL = new ArrayList<>();
        Elfs e = new Elfs("a",100,'b');
        Elfs e1 = new Elfs();
//        e.setAbility('w');
        AL.add(e);AL.add(e1);
        System.out.println(AL);
        System.out.println(AL.get(0));
        System.out.println(AL.get(0).getAbility());
    }
}
