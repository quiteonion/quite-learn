package A20240508.Teacher;

public class Person {
    String name;
    public Person(String name){
        this.name = name;
    }

    public void feeding(Animal animal){
        if (animal instanceof Dog){
            System.out.println("www");
        }
        System.out.println(this.name +"养了"+animal.name);
    }
}
