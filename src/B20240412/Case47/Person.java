package B20240412.Case47;

public class Person {
    private String name;
    private String address;
    private int age;
    private double wages;
    private int id;

    public Person() {
    }

    public Person(String name, String address, int age, double wages, int id) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.wages = wages;
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public double getWages() {
        return wages;
    }


    public void setWages(double wages) {
        this.wages = wages;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void wagesup(double wages){
        this.wages = wages*1.1;
    }

}
