package B20240415.StaticKuai;

public class M {
    public static void main(String[] args) {
        MTest MT = new MTest();
        System.out.println(MT.getId());
        MTest MT1 = new MTest();
        System.out.println(MT.getId());
        System.out.println(MT1.getId());
        MTest MT2 = new MTest();
        System.out.println(MT.getId());
        MTest MT3 = new MTest();
        System.out.println(MT.getId());
        MTest MT4 = new MTest();
        System.out.println(MT.getId());

    }
}
