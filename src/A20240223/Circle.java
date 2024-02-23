package A20240223;

import java.util.Scanner;

public class Circle {
    private double radius;
    static double PI = 3.1415;

    public Circle() {
    }

    public Circle(double radius, double PI) {
        this.radius = radius;
        this.PI = PI;
    }

    /**
     * 获取
     * @return PI
     */

    /**
     * 获取
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * 设置
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double Area(){
        double area = this.radius*this.radius*PI;
        return area;
    }
    public double Circumference(){
        double circumference = this.radius*PI;
        return circumference;
    }

}
