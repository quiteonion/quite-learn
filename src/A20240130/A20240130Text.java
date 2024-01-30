package A20240130;

public class A20240130Text {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int found = 3;
        boolean fo = true;
        for (int i = 0, j = arr.length - 1; i < arr.length / 2 && j > arr.length / 2; i++, j--) {
            if (arr[j] == found || arr[i] == found) {
                System.out.println("这个数字为" + found);
                fo = false;
                break;
            }
        }
        if (fo) {
            System.out.println("找不到这个数字");
        }
    }
}
