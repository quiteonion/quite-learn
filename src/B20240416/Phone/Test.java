package B20240416.Phone;

public class Test {
    public static void main(String[] args) {
        OldPhone OP = new OldPhone();
        NewPhone NP = new NewPhone();
        usePhone(OP);
        System.out.println("=============");
        usePhone(NP);
    }
    public static void usePhone(Phone p){
        if (p instanceof OldPhone OP){
            OP.call();
            OP.email();
        } else if (p instanceof NewPhone NP) {
            NP.call();
            NP.email();
            NP.playGame();
        }else {
            System.out.println("不是手机");
        }

    }
}
