package B20240404;

public class Auto {
    private int tyreNumber;
    private double weight;
    private double velocity;

    public Auto() {
    }

    public Auto(int tyreNumber, double weight, double velocity) {
        this.tyreNumber = tyreNumber;
        this.weight = weight;
        this.velocity = velocity;
    }


    public int getTyreNumber() {
        return tyreNumber;
    }

    public void setTyreNumber(int tyreNumber) {
        this.tyreNumber = tyreNumber;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getVelocity() {
        return velocity;
    }


    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public void addVelocity(){
        System.out.println("up");
    }
    public void decreaseVelocity(){
        System.out.println("decrease");
    }
    public void stop(){
        System.out.println("stop");
    }
}
