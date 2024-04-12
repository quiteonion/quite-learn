package B20240412.Case47;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("老王","胡建",28,2999,002);
        manger m = new manger("夏利","厦门",18,22399,005);
        System.out.println(e.getWages());
        System.out.println(m.getWages());
        e.wagesup(e);
        e.wagesup(m);
        System.out.println(e.getWages());
        System.out.println(m.getWages());
    }
}
