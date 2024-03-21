package A20240321.access_control_v2.package1;

public class SubOrder extends Order{
    public void test() {
        SubOrder subOrder = new SubOrder();

        subOrder.orderProtected = 0;

        subOrder.methodProtected();
    }
}
