package A20240515.note.MysortUtilState;


public class Test {
    public static void main(String[] args) {
        Student[] studentArr = {new Student("林檎", 23), new Student("齐夏", 34), new Student("楚天秋", 21), new Student("孟州", 16), new Student("钱多多", 3)};
//        TV[] TVArr = {new TV("1", 2333), new TV("2", 45245), new TV("3", 57437), new TV("4", 333), new TV("5", 1232),};
//        Room[] roomArr = {new Room("1", 2315513), new Room("2", 143646), new Room("3", 8215513), new Room("4", 657513), new Room("5", 22363)};
//
//        TestUtil.sort(roomArr);
//        TestUtil.print(roomAr);
    }
}

abstract class MyComparable {
    public abstract int isLarger(MyComparable myComparable);
    public abstract int isName(MyComparable myComparable);
}

class Student extends MyComparable {
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
    public int isLarger(MyComparable myComparable) {
        if (myComparable instanceof Student student) {
            return (int) (this.age - student.age);
        }
        return 0;
    }


    @Override
    public int isName(MyComparable myComparable) {
        if (myComparable instanceof Student student) {
            return (int)this.name.charAt(0) -(int) student.name.charAt(0);
        }
        return 0;
    }
}

//class TV extends MyComparable {
//    String name;
//    int price;
//
//    public TV(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }
//
//
//    @Override
//    public String toString() {
//        return name + "  " + price;
//    }
//
//
//    @Override
//    public int isLarger(MyComparable myComparable) {
//        if (myComparable instanceof TV tv) {
//            return (int) (this.price - tv.price);
//        }
//        return 0;
//    }
//
//    @Override
//    public String isName() {
//        return null;
//    }
//}

//class Room extends MyComparable {
//    String name;
//    int area;
//
//    public Room(String name, int area) {
//        this.name = name;
//        this.area = area;
//    }
//
//
//    @Override
//    public String toString() {
//        return name + "  " + area;
//    }
//
//
//    @Override
//    public int isLarger(MyComparable myComparable) {
//        if (myComparable instanceof Room room) {
//            return (int) (this.area - room.area);
//        }
//        return 0;
//    }
//
//    @Override
//    public String isName() {
//        return null;
//    }
//}
