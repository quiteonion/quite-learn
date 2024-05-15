package A20240515.note.MysortUtilState;

public class StudentFirstLetter implements MyComparator {
    public int Sort(Object m1 , Object m2) {
        Student s1 = (Student) m1;
        Student s2 = (Student) m2;
        if ((int)(s1.name.charAt(0)) > (int)(s2.name.charAt(0))) {
            return 1;
        } else if ((int)(s1.name.charAt(0)) == (int)(s2.name.charAt(0))) {
            return 0;
        } else {
            return -1;
        }
    }
}

