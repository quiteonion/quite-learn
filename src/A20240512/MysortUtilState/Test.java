package A20240512.MysortUtilState;


public class Test {
    public static void main(String[] args) {
        Student[] studentArr = {new Student("Q", 23), new Student("W", 34), new Student("E", 21), new Student("R", 16), new Student("T", 3)};
        TV[] TVArr = {new TV("1",2333),new TV("2",45245),new TV("3",57437),new TV("4",333),new TV("5",1232),};
        Room[] roomArr = {new Room("1",2315513),new Room("2",143646),new Room("3",8215513),new Room("4",657513),new Room("5",22363)};

//        TestUtil.studentPrint(studentArr);
//        System.out.println();
//        TestUtil.studentSort(studentArr);
//        System.out.println();
//        TestUtil.studentPrint(studentArr);
        TestUtil.sort(roomArr);
        TestUtil.print(roomArr);
    }
}
 class ALL{
    int number;
    public ALL(int number){
        this.number = number;
    }
}
class Student extends ALL {
    String name;
    int age;

    public Student(String name, int age) {
        super(age);
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "  " + age;
    }


}
class TV extends ALL  {
    String name;
    int price;

    public TV(String name, int price) {
        super(price);
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "  " + price;
    }


}
class Room extends ALL{
    String name;
    int area;
    public Room(String name,int area){
        super(area);
        this.name = name;
        this.area = area;
    }
    @Override
    public String toString() {
        return name + "  " + area;
    }


}
