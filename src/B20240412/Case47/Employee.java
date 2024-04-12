package B20240412.Case47;

public class Employee extends Person {
    public Employee(String name, String address, int age, double wages, int id) {
        super(name, address, age, wages, id);
    }


    public void wagesup(Person p) {
        if (p.getName().equals("小王")) {
            p.setWages(p.getWages() * 1.2);
        } else {
            p.setWages(p.getWages() * 1.1);
        }
    }
}
