package Job;

public class Table99 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            /*外循环建立行*/
            for (int j = 1; j <= i; j++) {
                /*内循环成立列*/
                System.out.print(i + " * " + j + " = " + i * j + "   ");
            }
            System.out.println();
            /*换行*/
        }
    }
}
