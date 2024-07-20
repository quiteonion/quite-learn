package B20240720;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a = 0;
        int b = arr.length - 1;
        int number = 10;
        boolean flag = true;
        while (a > b) {
            if (arr[(a + b) / 2] < number) {
                a = (a + b) / 2 - 1;
            } else if (arr[(a + b) / 2] > number) {
                b =  (a + b) / 2 + 1;
            }else {
                System.out.println((a + b) / 2);
                System.out.println("存在");
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("不存在");
    }
}
