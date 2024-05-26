package B20240526;

import java.util.Random;

public class Conbat {
    String name;
    int bool;

    public Conbat(String name, int bool) {
        this.name = name;
        this.bool = bool;
    }

    public void attack(Conbat conbat) {
        Random r = new Random();
        int kill = r.nextInt(10) + 1;
        conbat.bool = conbat.bool - kill;
        if (conbat.bool < 0) {
            conbat.bool = 0;
        }
        System.out.println(this.name + " attack " + conbat.name + " 造成了 " + kill + "点伤害 , " + conbat.name + " 还剩下" + conbat.bool);
        if (this.bool == 0) {
            System.out.println(conbat.name + "win");
            System.exit(0);
        } else if (conbat.bool == 0) {
            System.out.println(this.name + "win");
            System.exit(0);
        }
    }
}

