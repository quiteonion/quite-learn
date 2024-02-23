package A20240223;

import java.util.Scanner;

public class Circle {
    double radius;
   double PI = 3.1415;


    public void Area() {
        double area = this.radius*this.radius*PI;
        System.out.println("面积为"+ area);
    }
    public void Circumference(){
        double circumference = this.radius*PI;
        System.out.println("周长为"+circumference);
    }


   /* public double Area(){
        double area = this.radius*this.radius*PI;
        return area;
    }
    public double Circumference(){
        double circumference = this.radius*PI;
        return circumference;
    }*/

}
