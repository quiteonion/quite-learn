package A20240131;

import java.util.Random;
import java.util.Scanner;

public class ConbatText {
    public static void main(String[] args) {
        Conbat conbat1 = new Conbat("985", 100, 'n');
        Conbat conbat2 = new Conbat("211", 100, 'n');
        Random random = new Random();
        int number = random.nextInt(2)+1;
        while (true){
            if (number == 1){
                    conbat1.attr(conbat2);
                    conbat2.attr(conbat1);
                    if (conbat1.getbool()==0){
                        System.out.println(conbat2.getName()+"获得胜利");
                        break;
                    }
                    if (conbat2.getbool()==0){
                        System.out.println(conbat1.getName()+"获得胜利");
                        break;
                    }
            }else {
                conbat2.attr(conbat1);
                conbat1.attr(conbat2);
                if (conbat2.getbool()==0){
                    System.out.println(conbat2.getName()+"获得胜利");
                    break;
                }
                if (conbat2.getbool()==0){
                    System.out.println(conbat1.getName()+"获得胜利");
                    break;
                }
            }
        }

    }
}
