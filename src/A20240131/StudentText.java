package A20240131;

public class StudentText {
    public static void main(String[] args) {
        Student student = new Student("阿珍",18 ,'女',"沉鱼落雁闭月羞花的珍");
        Student student1 = new Student("阿强",19,'男',"英武帅气俊朗壮硕的强");
        student.attr(student1);
    }
}
