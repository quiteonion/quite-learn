package B20240403;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = {new Student("1"), new Student("2"), new Student("3"), new Student("4")};
        boolean flag = true;
        int w = 0, l = 0;
        while (true) {
            System.out.println("请输入你的姓名并进行投票");
            String name = sc.next();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].getName().equals(name) && arr[i].isVote()) {
                    flag = false;
                    System.out.println("你要投谁呢？");
                    System.out.println("1、小王 ， 2、小李");
                    int voit = sc.nextInt();
                    if (voit == 1) {
                        System.out.println("投票成功");
                        w++;
                        arr[i].setVote();
                    } else if (voit == 2) {
                        System.out.println("投票成功");
                        l++;
                        arr[i].setVote();
                    } else {
                        System.out.println("没有这个选项");
                    }
                }
            }
            if (flag)
                System.out.println("名字输入错误！");
            System.out.println("是否退出投票");
            int number = sc.nextInt();
            if (number == 1)
                break;
        }
        System.out.println("结果为");
        System.out.println("小王" + " " + w);
        System.out.println("小李" + " " + l);
    }
}

class Student {
    private String name;
    private boolean vote = true;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public boolean isVote() {
        return vote;
    }


    public void setVote() {
        this.vote = false;
    }

}

