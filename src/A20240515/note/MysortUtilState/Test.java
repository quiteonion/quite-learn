package A20240515.note.MysortUtilState;


public class Test {
    public static void main(String[] args) {
        Student[] studentArr = {new Student("l林檎", 23), new Student("q齐夏", 34), new Student("c楚天秋", 21), new Student("m孟州", 16), new Student("y余念安", 3)};
        TestUtil.sort(studentArr);
        TestUtil.print(studentArr);
        System.out.println("=========");
        TestUtil.surSort(studentArr);
        TestUtil.surPrint(studentArr);
    }
}




