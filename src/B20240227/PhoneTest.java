package B20240227;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] arr = new Phone[3];
        for (int i = 0; i < arr.length; i++) {
            Phone p = new Phone();
            System.out.print("手机的品牌：");
            String brand = sc.next();
            p.setBrand(brand);
            System.out.print("手机的价格：");
            double price = sc.nextDouble();
            p.setPrice(price);
            System.out.print("手机的颜色：");
            String color = sc.next();
            p.setColor(color);
            arr[i] = p;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getPrice());
        }
        double number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number+arr[i].getPrice();
        }

        System.out.println("平均价格为"+number/arr.length);
    }
}
