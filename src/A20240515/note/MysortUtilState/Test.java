package A20240515.note.MysortUtilState;


public class Test {
    public static void main(String[] args) {
        Student[] studentArr = {new Student("l林檎", 23), new Student("q齐夏", 34), new Student("c楚天秋", 21), new Student("m孟州", 16), new Student("y余念安", 3)};
        MyComparator m = new StudentAgeLetter();
        MyComparable p;
        for (int i = 0; i < studentArr.length - 1; i++) {
            for (int j = 0; j < studentArr.length - i - 1; j++) {
                if ((m.Sort(studentArr[i], studentArr[i + 1])) > 0) {
                    p = studentArr[j];
                    studentArr[j] = studentArr[j + 1];
                    studentArr[j + 1] = (Student) p;
                }
            }
        }
        System.out.println("=========");
        TestUtil.surSort(studentArr);
        TestUtil.surPrint(studentArr);
    }
}




