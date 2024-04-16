package B20240416.Lptop;

public class Test {
    public static void main(String[] args) {
        Lptop l = new Lptop();
        Mouse m = new Mouse();
        KeyBoard kb = new KeyBoard();
        l.OpenLptop();
        m.openUSB();
        m.tornoffUSB();
        kb.openUSB();
        kb.tornoffUSB();
        l.tornoffLptop();
    }
}
