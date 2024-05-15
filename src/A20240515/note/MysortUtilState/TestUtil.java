package A20240515.note.MysortUtilState;

public class TestUtil {
    public static void print(MyComparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
    public static void sort(MyComparable[] arr) {
        MyComparable p;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].isLarger(arr[j+1])>0) {
                    p = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = p;
                }
            }
        }
    }

    public static void surSort(MyComparable[] arr){
        //获取姓名首字母的
        MyComparable p;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].isName(arr[j+1])>0) {
                    p = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = p;
                }
            }
        }
    }
    public static void surPrint(MyComparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
}
