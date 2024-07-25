package B20240725;



public class palouti {
    public static void main(String[] args) {
        System.out.println(m(20));
    }
    public static int m(int n){
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return m(n-1)+m(n-2);
    }
}
