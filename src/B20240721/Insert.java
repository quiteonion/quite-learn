package B20240721;

public class Insert {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 0, 22, 73, 19, 55, 23};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                for (int j = i + 1; j < arr.length; j++) {
                    int temp = j;
                    while (temp > 0 && arr[temp] < arr[temp - 1]) {
                        int num = arr[temp];
                        arr[temp] = arr[temp - 1];
                        arr[temp - 1] = num;
                        temp--;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
