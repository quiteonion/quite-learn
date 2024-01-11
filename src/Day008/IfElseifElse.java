package Day008;

public class IfElseifElse {
    public static void main(String[] args) {
        num1(1);
        num2(2);
        num3(41313);
    }
    public static void num1(int number){
        if (number == 1){
            System.out.println("我已经习惯一个人生活");
        }
    }
    public static void num2(int number){
        if (number == 1){
            System.out.println("我已经习惯一个人生活");
        } else if (number == 2) {
            System.out.println("一开始不就是一个人生活");
        }
    }
    public static void num3(int number){
        if (number == 1){
            System.out.println("我已经习惯一个人生活");
        } else if (number == 2) {
            System.out.println("一开始不就是一个人生活");
        }else {
            System.out.println("我的房间，你最爱的角落，那本你没读完的书还在原地放着");
        }
    }
}
