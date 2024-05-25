package A20240126;

public class Main {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        j*=i++;
        System.out.println(j);
        System.out.println(i);
    }
}
