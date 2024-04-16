package B20240416.Lptop;

public class KeyBoard implements USB{
    @Override
    public void openUSB() {
        System.out.println("键盘开启");
    }

    @Override
    public void tornoffUSB() {
        System.out.println("键盘关闭");
    }
}
