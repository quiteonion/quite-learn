package B20240511;

import com.sun.jdi.Value;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    static Random r = new Random();
    static Scanner sc = new Scanner(System.in);
    static char[] arr = new char[5];

    public static void main(String[] args) {
        //在登录注册页面中，除了用户名和密码外，通常也会包含验证码。验证码是用来区分用户是计算机还是人
        // ，防止恶意破解密码、刷票、灌水等行为。在判断验证码时一般不区分大小写。请编写程序模拟验证码的判断过程，
        // 如果输入正确，给出提示，结束程序。如果输入错误，给出提示，验证码刷新，重新输入，直至正确为止。
        while (true){
            m1();
            String n = String.valueOf(arr);
            System.out.println(n);
            String o = sc.next();
            if (n.equals(o)){
                System.out.println("正确");
                break;
            }else {
                System.out.println("错误");
            }
        }

    }

    public static void m1() {


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
