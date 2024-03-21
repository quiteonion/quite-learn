package A20240321.access_control_v2.package2;


import A20240321.access_control_v2.package1.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        //调用属性
        order.orderPublic = 2;
//        order.orderDefault = 1;
//        order.orderProtected = 0;
//        order.orderPrivate = 3;

        //调用方法
//        order.methodPublic();
//        order.methodDefault();
//        order.methodProtected();
//        order.methodPrivate();
    }
}
