package B20240526;

public class Bubbling {
    public static void main(String[] args) {
        int[] arr = {4, 325, 2, 582, 2735, 137, 513, 59183, 537439, 44, 3, 14, 0, 4190, 4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
