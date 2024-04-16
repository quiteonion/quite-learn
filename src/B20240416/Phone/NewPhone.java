package B20240416.Phone;

public class NewPhone extends Phone implements IPlay{
    public void call(){
        System.out.println("新手机正在打电话。。。");
    }
    public void email(){
        System.out.println("新手机正在发短信。。。");
    }

    @Override
    public void playGame() {
        System.out.println("玩王者农药。。。");
    }
}
