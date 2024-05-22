package A20240515.note.MysortUtilState;

public class StudentFirstLetter implements MyComparator<Student> {
    public int Sort(Student m1 , Student m2) {
        if ((int)(m1.name.charAt(0)) > (int)(m2.name.charAt(0))) {
            return 1;
        } else if ((int)(m1.name.charAt(0)) == (int)(m2.name.charAt(0))) {
            return 0;
        } else {
            return -1;
        }
    }
}

