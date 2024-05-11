package B20240511;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    static Random r = new Random();

    public static void main(String[] args) {
        char[] arr = new char[5];
        //在登录注册页面中，除了用户名和密码外，通常也会包含验证码。验证码是用来区分用户是计算机还是人，
        // 防止恶意破解密码、刷票、灌水等行为。请查看Random、StringBuilder相关API，定义方法，获取一个包含4个字符的验证码，
        // 每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。例如:4mk2
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            arr[i] = re();
        }
        char[] numberArr = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int a = r.nextInt(arr.length);
        arr[arr.length - 1] = arr[a];
        arr[a] = numberArr[r.nextInt(numberArr.length)];
        re();
        for (char j : arr) {
            System.out.println(j);
        }
    }

    public static char re() {
        int number = r.nextInt('z');
        if ((number > 'a' && number < 'z') || (number > 'A' && number < 'Z')) {
            return (char) (number);
        }
        return re();
    }
}
