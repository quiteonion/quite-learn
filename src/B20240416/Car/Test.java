package B20240416.Car;

public class Test {
    public static void main(String[] args) {
        Bus b = new Bus();
        BabyCar BC = new BabyCar();
        dirverCar(b);
        dirverCar(BC);
    }

    public static void dirverCar(Car c) {
        c.run();
    }
}
