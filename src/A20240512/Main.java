package A20240512;

public class Main {
    public static void main(String[] args) {
        FU zi = new ZI(1,2);

    }
}
class FU{
    int i;
}
class ZI extends FU{
    int j;
    public ZI(int j , int l ){
        this.j = j;
        System.out.println(this.j);
        System.out.println(super.i);
        super.i = l;
        System.out.println(this.j);
        System.out.println(super.i);
        this.i = l;
        System.out.println(this.j);
        System.out.println(super.i);

    }
}
