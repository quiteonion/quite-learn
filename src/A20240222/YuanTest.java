package A20240222;

import java.util.Scanner;

public class YuanTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Yuan yuan = new Yuan();
        System.out.println("请输入圆的半径");
        double r = scanner.nextInt();
        yuan.setR(r);
        System.out.println("圆的面积为：" + yuan.MianJi() + "   圆的周长为：" + yuan.ZhouChang());
    }
}
