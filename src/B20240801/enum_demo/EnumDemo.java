package B20240801.enum_demo;

public enum EnumDemo implements ForEnumDemo{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    @Override
    public void desc() {
        System.out.println("qwert");
    }
}
