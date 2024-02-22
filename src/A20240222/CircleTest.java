package A20240222;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("请输入圆的半径");
        double r = scanner.nextInt();
        circle.setRadius(r);
        System.out.println("圆的面积为：" + circle.area() + "   圆的周长为：" + circle.circumference());
    }
}
