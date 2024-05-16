package B20240516.Test63;

import java.util.ArrayList;
import java.util.Scanner;

public class Test63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> HashSet = new ArrayList<>();
        while (true) {
            User u = new User();

            System.out.println("请输入你的姓名");
            String name = sc.next();
            u.setName(name);

            System.out.println("请输入你的密码");
            String password = sc.next();
            u.setPassword(password);

            System.out.println("请确认密码");
            String rPassword = sc.next();

            boolean flagPassword =  TestUtil.confirmPassword(password, rPassword);
            if (!flagPassword){
                System.out.println("两次密码有误");
                break;
            }

            System.out.println("请输入你的生日");
            String birthday = sc.next();
            u.setBirthday(birthday);

            System.out.println("请输入你的手机号");
            long phone = sc.nextInt();
            u.setPhone(phone);

            HashSet.add(u);
            System.out.println("是否退出注册");
            int i = sc.nextInt();
            if (i == 1) {
                break;
            }
        }
        for (int i = 0; i < HashSet.size(); i++) {
            System.out.println(HashSet.get(i));
        }
    }
}
