package B20240721;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 0, 22, 73, 19, 55, 23};
        /**
         * 插入排序
         */
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = i;
                break;
            }
        }
        for (int i = temp; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int num = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = num;
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
