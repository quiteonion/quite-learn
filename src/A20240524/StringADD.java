package A20240524;

import java.sql.Time;

public class StringADD{
    static int count = 100000;

    public static void main(String[] args) {

        new Util(){
            @Override
            public void mouthod() {
                String result = "";
                for (int i = 0; i < count; i++) {
                    result += i;
                }
            }
        }.time();

        System.out.println("=== === === ");

        new Util(){
            @Override
            public void mouthod() {
                StringBuffer sb1 = new StringBuffer();
                for (int i = 0; i < count; i++) {
                    sb1.append(i);
                }
            }

        }.time();
        System.out.println("=== === === ");
        new Util(){
            @Override
            public void mouthod() {
                StringBuilder sb2 = new StringBuilder();
                for (int i = 0; i < count; i++) {
                    sb2.append(i);
                }
            }
        }.time();


    }
}

abstract class Util{
    public abstract void mouthod();

    public void time() {
        long begin = System.currentTimeMillis();
        this.mouthod();
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

}
