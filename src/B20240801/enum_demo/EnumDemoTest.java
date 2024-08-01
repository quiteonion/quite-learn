package B20240801.enum_demo;

public class EnumDemoTest {
    public static void main(String[] args) {
        EnumDemo.FRIDAY.desc();
        for (EnumDemo enumDemo : EnumDemo.values()){
            enumDemo.desc();
        }
    }
}
