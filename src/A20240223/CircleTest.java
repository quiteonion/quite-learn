package A20240223;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("请输入半径");
        int radius = scanner.nextInt();
        circle.setRadius(radius);
        System.out.println("面积为："+circle.Area()+"周长为："+circle.Circumference());
    }
}
