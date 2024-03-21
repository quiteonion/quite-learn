package A20240321;

public class Circle {

    public Circle(){

    }

    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return radius*radius*3.14;
    }

}
