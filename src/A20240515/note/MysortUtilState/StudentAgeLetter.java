package A20240515.note.MysortUtilState;

public class StudentAgeLetter implements MyComparator {

    public int Sort(Object m1 , Object m2) {
        Student s1 = (Student) m1;
        Student s2 = (Student) m2;
        if (s1.age>s2.age){
            return 1;
        }else if (s1.age==s2.age){
            return 0;
        }else {
            return -1;
        }
    }
}
