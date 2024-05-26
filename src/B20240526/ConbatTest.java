package B20240526;

public class ConbatTest {
    public static void main(String[] args) {
        Conbat c = new Conbat("1" , 100);
        Conbat c2 = new Conbat("2" , 100);
        while (true){
            c.attack(c2);
            System.out.println("=== === ===");
            c2.attack(c);
        }
    }
}
