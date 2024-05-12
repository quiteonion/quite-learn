package A20240512.MakeNewBehavior.MysortUtilState;

public class TestUtil {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
    public static void sort(int[] arr) {
        int p;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    p = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = p;
                }
            }
        }

    }
    public static void print(ALL[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
    }
    public static void sort(ALL[] arr) {
        ALL p;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].isLarger(arr[j+1])) {
                    p = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = p;
                }
            }
        }

//    }
//    public static void studentSort(ALL[] arr){
//        ALL p;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if (arr[j].returnNumber() > arr[j + 1].returnNumber()) {
//                    p = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = p;
//                }
//            }
//        }
//    }
//        public static void studentPrint (ALL[]arr){
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + "   ");
//            }
//        }
//        public static void allSort () {
//
//        }
//        public static void allPrint () {
//
//        }

    }
}
