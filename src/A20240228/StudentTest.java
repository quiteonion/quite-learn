package A20240228;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        int number = 0;
        Student[] array = new Student[50];
        while (true) {
            menu();
            System.out.println("请选择你的选项");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    displayStudent(array, number);
                    continue;
                case 2:
                    Student aw = addStudent(array, number);
                    array[number] = aw;
                    number++;
                    continue;
                case 3:
                    deleteStudent(array, number);
                    number--;
                    continue;
                case 4:
                    reviseStudent(array, number);
                    continue;
                case 5:
                    findStudent(array, number);
                    continue;
                case 6:
                    System.exit(-1);
                    continue;
                default:
                    System.out.println("输入错误，请重新输入");
            }
        }
    }

    public static void menu() {
        System.out.println("-------------------------");
        System.out.println("---------- 菜单 ----------");
        System.out.println("-----1、显示所有学生--------");
        System.out.println("-----2、增加一个学生--------");
        System.out.println("-----3、删除一个学生--------");
        System.out.println("-----4、修改学生的信息------");
        System.out.println("-----5、查找学生的信息------");
        System.out.println("-----6、退出系统-----------");
        System.out.println("-------------------------");
    }

    public static Student addStudent(Student[] array, int number) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的姓名");
        String name = scanner.next();
        student.setName(name);
        System.out.println("请输入学生的学号");
        int id = scanner.nextInt();
        student.setId(id);
        for (int i = 0; i < number; i++) {
            if (id == array[i].getId()) {
                System.out.println("id重复输入错误！");
                System.exit(-1);
            }
        }
        System.out.println("请输入学生的年龄");
        int age = scanner.nextInt();
        student.setAge(age);
        System.out.println("请输入学生的性别");
        String gender = scanner.next();
        student.setGender(gender);

        return student;
    }

    public static void displayStudent(Student[] array, int number) {
        Scanner sc = new Scanner(System.in);
        if (number == 0) {
            System.out.println("还没有添加学生哦！");
            System.exit(-1);
        }
        System.out.println("请选择您所需要的排行格式");
        System.out.println("1、性别排行   2、学号排行");
        int rankingNumber = sc.nextInt();
        switch (rankingNumber) {
            case 1:
                displayStudent_gender(array, number);
                break;
            case 2:
                displayStudent_id(array, number);
                break;
            default:
                System.out.println("您的选择有误，请重新选择！");
        }
    }

    public static void displayStudent_gender(Student[] array, int number) {
        for (int i = 0; i < number; i++) {
            if (array[i].getGender().equals("男")) {
                System.out.println("name\tid\tage\tgender");
                System.out.println(array[i].getName() + "\t" + array[i].getId() + "\t" + array[i].getAge() + "\t" + array[i].getGender());
            }
        }
        for (int i = 0; i < number; i++) {
            if (array[i].getGender().equals("女")) {
                System.out.println("name\tid\tage\tgender");
                System.out.println(array[i].getName() + "\t" + array[i].getId() + "\t" + array[i].getAge() + "\t" + array[i].getGender());
            }
        }
    }

    public static void displayStudent_id(Student[] array, int number) {
        Student RE;
        for (int j = 0; j < number; j++) {
            for (int i = 0; i < number - 1; i++) {
                if (array[i].getId() > array[i + 1].getId()) {
                    RE = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = RE;
                }
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.println("name\tid\tage\tgender");
            System.out.println(array[i].getName() + "\t" + array[i].getId() + "\t" + array[i].getAge() + "\t" + array[i].getGender());
        }
    }

    //删除之后重新排列数组
    public static void deleteStudent(Student[] array, int number) {
        if (number == 0) {
            System.out.println("还没有添加学生哦！");
            System.exit(-1);
        }
        Scanner sc = new Scanner(System.in);
        displayStudent_id(array, number);
        //学号删除，名称删除
        System.out.println("请选择您要删除的学生的学号");
        int deleteId = sc.nextInt();
        boolean flag = true;

        for (int i = 0; i < number; i++) {
            if (deleteId == array[i].getId()) {
                for (int j = i; j < number - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[number] = null;
            }
            flag = false;
        }
        if (flag) {
            System.out.println("您要删除的id不存在");
        }
    }


    public static void findStudent(Student[] array, int number) {
        Scanner sc = new Scanner(System.in);
        if (number == 0) {
            System.out.println("还没有添加学生哦！");
            System.exit(-1);
        }
        System.out.println("请选择您所需要的查找方式");
        System.out.println("1、姓名查找   2、学号查找");
        int rankingNumber = sc.nextInt();
        switch (rankingNumber) {
            case 1:
                findStudent_name(array, number);
                break;
            case 2:
                findStudent_id(array, number);
                break;
            default:
                System.out.println("您的选择有误，请重新选择！");
        }
    }

    public static void findStudent_name(Student[] array, int number) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("请输入您要查找的学生姓名");
        String name = sc.next();
        for (int i = 0; i < number; i++) {
            if (array[i].getName().equals(name)) {
                System.out.println("查找到您要查找的学生信息：学生姓名：" + array[i].getName() + "学生学号：" + array[i].getId() + "学生性别：" + array[i].getGender() + "学生年龄" + array[i].getAge());
                flag = false;
            }
        }
        if (flag) {
            System.out.println("查找不到该学生，请核对姓名是否正确：" + name);
        }
    }

    public static void findStudent_id(Student[] array, int number) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("请输入您要查找的学生id");
        int id = sc.nextInt();
        for (int i = 0; i < number; i++) {
            if (array[i].getId() == id) {
                System.out.println("查找到您要查找的学生信息：学生姓名：" + array[i].getName() + "学生学号：" + array[i].getId() + "学生性别：" + array[i].getGender() + "学生年龄" + array[i].getAge());
                flag = false;
            }
        }
        if (flag) {
            System.out.println("查找不到该学生，请核id是否正确：" + id);
        }
    }

    public static void reviseStudent(Student[] array, int number) {
        Scanner sc = new Scanner(System.in);
        if (number == 0) {
            System.out.println("还没有添加学生哦！");
            System.exit(-1);
        }
        System.out.println("请选择您所需要修改的学生的id");
        displayStudent_id(array, number);
        int id = sc.nextInt();
        for (int i = 0; i < number; i++) {
            if (array[i].getId() == id) {
                System.out.println("您要修改的部分为：");
                System.out.println("1、年龄   2、姓名   3、id");
                int rankingNumber = sc.nextInt();
                switch (rankingNumber) {
                    case 1:
                        reviseStudent_age(array, i);
                        break;
                    case 2:
                        reviseStudent_name(array, i);
                        break;
                    case 3:
                        reviseStudent_id(array, i);
                        break;
                    case 4:
                    default:
                        System.out.println("您的选择有误，请重新选择！");
                }
            }
        }


    }

    public static void reviseStudent_name(Student[] array, int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("要修改为：");
        String name = sc.next();
        array[i].setName(name);
        System.out.println("修改完成");
    }

    public static void reviseStudent_id(Student[] array, int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("要修改为：");
        int id = sc.nextInt();
        array[i].setId(id);
        System.out.println("修改完成");
    }

    public static void reviseStudent_age(Student[] array, int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("要修改为：");
        int age = sc.nextInt();
        array[i].setAge(age);
        System.out.println("修改完成");
    }
}