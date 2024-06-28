package B20240628;

public class Circle {
    double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class Cylinder extends Circle {

    public Cylinder(double radius ,double height ){
        super(radius);
        this.height = height;
    }
    double height;

    public double getArea() {
        return radius * radius * Math.PI * 2 + 2 * radius * Math.PI * height;
    }

    public double getVolume() {
        return radius * radius * Math.PI * height;
    }
}