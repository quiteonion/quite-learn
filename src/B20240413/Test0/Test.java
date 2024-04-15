package B20240413.Test0;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("老王", 18);
        Pet d = new Dog(2,"red");
        Dog e = (Dog)d;
        p.keepPet(e, "aa");
        e.lookHome();
    }
}
