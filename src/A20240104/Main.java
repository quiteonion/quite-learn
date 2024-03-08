package A20240104;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        Student s = new Student();


        //配置类环境

        while (true) {
            System.out.println("1.添加学生");
            System.out.println("2.查看所有学生");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("请输入添加的学生信息");
                    add_Student_1(p);
                    add_Strdent_2(s);
                    break;
                case 2:
                    look_Student(p, s);
                    break;
                default:
                    System.out.println("输错啦大哥");
                    continue;
            }
        }
    }

    public static Person add_Student_1(Person p) {
        Scanner sc = new Scanner(System.in);



        System.out.println("名字");
        String a = sc.next();
        p.setName(a);
        System.out.println("年龄");
        int b = sc.nextInt();
        p.setAge(b);
        System.out.println("性别");
        String c = sc.next();
        p.setGender(c);

        return p;
    }

    public static Student add_Strdent_2(Student s){
        Scanner sc = new Scanner(System.in);
        System.out.println("学生id");
        int d = sc.nextInt();
        s.setStudentId(d);
        System.out.println("成绩");
        int e = sc.nextInt();
        s.setScore(e);
        return s;
    }

    public static void look_Student(Person p, Student s) {


        System.out.println("姓名\t年龄\t性别\t学生Id\t成绩");
        System.out.printf("%s\t%d\t%s\t%d\t%d\n", p.getName(), p.getAge(), p.getGender(), s.getStudentId(), s.getScore());
    }
}
