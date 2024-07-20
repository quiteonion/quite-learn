package B20240720;

public class SequentialTest {
    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 32, 7, 2, 124, 76, 47, 76};
        int number = 76;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            if (i1 == number) {
                System.out.println("找到了" + i);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("不存在");
        }
    }
}
