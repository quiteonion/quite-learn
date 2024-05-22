package A20240515.note.MysortUtilState;

public class StudentAgeLetter implements MyComparator<Student> {

    public int Sort(Student m1, Student m2) {
        if (m1.age > m2.age) {
            return 1;
        } else if (m1.age == m2.age) {
            return 0;
        } else {
            return -1;
        }
    }
}
