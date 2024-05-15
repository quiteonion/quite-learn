package A20240515.note.MysortUtilState;

public class StudentFirstLetter implements MyComparator {
    public int Sort(MyComparable m1 , MyComparator m2) {
        Student s1 = (Student) m1;
        Student s2 = (Student) m2;
        if (s1.name.charAt(0) > s2.name.charAt(0)) {
            return 1;
        } else if (s1.name.charAt(0) == s2.name.charAt(0)) {
            return 0;
        } else {
            return -1;
        }
    }
}

