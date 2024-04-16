package B20240416.Lptop;

public class Mouse implements USB{

    @Override
    public void openUSB() {
        System.out.println("鼠标开启");
    }

    @Override
    public void tornoffUSB() {
        System.out.println("鼠标关闭");
    }
}
