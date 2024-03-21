package A20240321;

public class Cylinder extends Circle{
    public Cylinder(){

    }
    private double length;

    public Cylinder(double length) {
        this.length = length;
    }


    public double getLength() {
        return length;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return 1;
    }

}
