package A20240324.Teacher;

public class Person {
    String name;
    public Person(String name){
        this.name = name;
    }

    public void feeding(Animal animal){
        System.out.println(this.name +"养了"+animal.name);
    }
}
