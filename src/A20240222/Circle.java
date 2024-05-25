package A20240222;

public class Circle {
    private double radius;
    static double PI = 3.141;

    public Circle() {
    }

    public Circle(double r, double pl) {
        this.radius = r;
        this.PI = pl;
    }
    public static double getPl() {
        return PI;
    }

    public static void setPl(double pl) {
        Circle.PI = pl;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        double s = this.radius*this.radius*PI;
        return s;
    }
    public double circumference(){
        double c = this.radius*PI;
        return c;
    }
}
