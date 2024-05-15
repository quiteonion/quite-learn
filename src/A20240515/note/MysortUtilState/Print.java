package A20240515.note.MysortUtilState;

public class Print {
    public static void print(Object[] arr , MyComparator m) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if ((m.Sort(arr[j], arr[j + 1])) > 0) {
                    Object p = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = p;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
