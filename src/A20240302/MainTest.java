package A20240302;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Main m = new Main();
        Main[] c = new Main[30];
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (number < 30) {
            menu();
            int number1 = sc.nextInt();
            switch (number1) {
                case 1:
                    Main a = add_Student();
                    c[number] = a;
                    number++;
                    continue;
                case 2:
                    display_Student(c , number);
                    continue;
                case 3:
                    System.exit(-1);
            }

        }
    }

    public static void menu() {
        System.out.println("1、添加 ， 2、遍历");
    }

    public static Main add_Student() {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("名字   年龄   id");
        String name = sc.next();
        int age = sc.nextInt();
        int id = sc.nextInt();
        m.setName(name);
        m.setAge(age);
        m.setId(id);
        return m;
    }

    public static void display_Student(Main[] c , int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("name   age   id   ");
            System.out.println(c[i].getName() +"   "+  c[i].getAge() +"   " +c[i].getId());
        }
    }
}
