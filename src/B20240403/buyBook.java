package B20240403;

import java.util.ArrayList;
import java.util.Scanner;

public class buyBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] array = {new Book("万能青年旅店", 18), new Book("西游记", 48), new Book("三国演义", 58), new Book("红楼梦", 45)};
        int[] arr = {0,0,0,0,0};
        boolean flag = true;
        while (flag) {
            System.out.println("请选择(退出为0)");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i].getName() + "+" + array[i].getId() + "+" + array[i].getPrivce());
            }
            int number = sc.nextInt();
            switch (number) {
                case 0:flag = false;break;
                case 1:
                    arr[number - 1] += 1;
                    break;
                case 2:
                    arr[number - 1] += 1;
                    break;
                case 3:
                    arr[number - 1] += 1;
                    break;
                case 4:
                    arr[number - 1] += 1;
                    break;
                default:
                    System.out.println("输入有问题");
            }
        }
        System.out.println("一下为清单");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getName() + "+" + array[i].getId() + "+" + array[i].getPrivce());
            System.out.println("买了"+arr[i]+"本，共花费"+array[i].getPrivce()*arr[i]+"元");
        }
    }
}

class Book {

    private String name;
    private int privce;
    private int id;
    private static int i;

    static {
        i = 1;
    }

    public Book() {
    }

    public Book(String name, int privce) {
        this.name = name;
        this.privce = privce;
        this.id = i;
        i++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrivce() {
        return privce;
    }

    public void setPrivce(int privce) {
        this.privce = privce;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
