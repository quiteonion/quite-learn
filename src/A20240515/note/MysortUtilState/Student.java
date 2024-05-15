package A20240515.note.MysortUtilState;


public class Student extends MyComparable {
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
        if (myComparable instanceof A20240515.note.MysortUtilState.Student student) {
            return (int) (this.age - student.age);
        }
        return 0;
    }


    @Override
    public int isName(MyComparable myComparable) {
        if (myComparable instanceof A20240515.note.MysortUtilState.Student student) {
            return (int) this.name.charAt(0) - (int) student.name.charAt(0);
        }
        return 0;
    }
}



