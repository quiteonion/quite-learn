package A20240510.MysortUtil;


public class Test {
    public static void main(String[] args) {
        Student[] studentArr = {new Student("Q", 23), new Student("W", 34), new Student("E", 21), new Student("R", 16), new Student("T", 3)};
        TV[] TVArr = {new TV("1",2333),new TV("2",45245),new TV("3",57437),new TV("4",333),new TV("5",1232),};


        TestUtil.print(studentArr);
        System.out.println();
        TestUtil.studentSort(studentArr);
        System.out.println();
        TestUtil.print(studentArr);
    }
}

class Student implements TestUtil {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "  " + age;
    }

    @Override
    public void yourNumber(int number) {

    }
}
class TV implements TestUtil {
    String name;
    int price;

    public TV(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "  " + price;
    }
    @Override
    public void yourNumber(int number) {

    }
}
