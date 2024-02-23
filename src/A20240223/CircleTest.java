package A20240223;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("请输入半径");
        int radius = scanner.nextInt();
        System.out.println("您输入的半径为"+circle.getRadius());
        circle.setRadius(radius);
        circle.Area();
        circle.Circumference();
    }
}
