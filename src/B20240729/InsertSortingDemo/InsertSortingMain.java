package B20240729.InsertSortingDemo;

public class InsertSortingMain {
    public static void main(String[] args) {
        /**
         * 插入排序就像扑克牌理牌一样
         */
        int[] arr = {2, 8, 6, 0, 5, 7, 1, 4, 3, 9};
        int i = 0;
        for (int ii = 0; ii < arr.length - 1; ii++) {
            if (arr[ii] > arr[ii + 1]) {
                i = ii;
                break;
            }
        }
        for (int jj = i; jj < arr.length; jj++) {
            int j = jj;
            while (j > 0) {
                if (arr[j] < arr[j - 1]) {
                    int l = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = l;
                }
                j--;
            }
        }
        for (int i1 : arr) {
            System.out.println(i1);
        }
    }
}
