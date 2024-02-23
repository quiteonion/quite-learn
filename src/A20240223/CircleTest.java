package A20240223;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("请输入半径");
        double radius = scanner.nextDouble();
        circle.setRadius(radius);
        System.out.println("您输入的半径为"+circle.getRadius());
        System.out.println("面积为"+ circle.Area()+'\n'+"周长为"+circle.Circumference());

    }
}
