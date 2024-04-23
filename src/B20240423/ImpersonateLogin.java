package B20240423;

import java.util.Scanner;

public class ImpersonateLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int account = 123456789;
        String password = "123456";
        for (int i = 1; i <= 3; i++) {
            System.out.println("账号");
            int acc = sc.nextInt();
            System.out.println("密码");
            String pw = sc.next();
            if (acc == account && password.equals(pw)){
                System.out.println("登录成功");
                return;
            }
            System.out.println("账号或者密码错误，还剩下"+(3-i)+"次机会");
        }
        System.out.println("登录失败");
    }
}
