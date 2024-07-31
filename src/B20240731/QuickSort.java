package B20240731;

public class QuickSort {
    public static void main(String[] args) {
        /**
         * 快速排序
         * 思考...
         */
        int[] arr = {5, 3, 1, 6, 8, 6, 2, 6, 9, 32, 7, 4, 2, 6, 8, 3};
        m(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void m(int[] arr, int i, int j) {
        if (i >= j)
            return;
        //把收集的数据集合起来
        int begin = i;
        int end = j;
        int temp = i;
        //=== === === === ===
        while (end != begin) {
            while (arr[end] >= arr[temp] && end > begin) {
                end--;
            }
            while (arr[begin] <= arr[temp] && end > begin) {
                begin++;
            }
                int p = arr[begin];
                arr[begin] = arr[end];
                arr[end] = p;
        }
        int p = arr[end];
        arr[end] = arr[temp];
        arr[temp] = p;

        m(arr, i, end - 1);
        m(arr, end + 1, j);
    }
}


