package A20240125;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入月数");
        int m = sc.nextInt();
        switch (m){
            case 1 , 3, 5 , 7, 8 ,10 , 12:
                break;
            case 2:
                System.out.println("该月份有31天");
                TWO();
                break;
            case 4 , 6 , 9 ,11:
                System.out.println("该月份有30天");
            default:
                System.out.println("输入有误!");
                break;
        }
    }
    public static void TWO(){
        System.out.println("今年是闰年吗？（是或否）");
        Scanner sc = new Scanner(System.in);
        String yesno = sc.next();
        switch (yesno){
            case "是":
                System.out.println("该月份有29天");
                break;
            case "否":
                System.out.println("该月份有28天");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
