package Day008;

public class Main {
    public static void main(String[] args) {
        String s = new String("我知道" + '\n' + "那些夏天就像是青春一样回不来！");
        System.out.println(s);

         byte a = 1;
        System.out.println(s+a);

        int b = 2;
        System.out.println(s+b);

        double c = 1.2;
        System.out.println(s+c);

        boolean d = true;
        System.out.println(d+s);

        short e = 4;
        System.out.println(e+s);

        long f = 124151251251L;
        System.out.println(s+f);

        char g = '1';
        System.out.println(s+g);

        float h = (float)1.2;
        System.out.println(s+h);

        String l = "代替梦想的也只能是勉为其难~";

        System.out.println(s+'\n'+l);
    }
}
