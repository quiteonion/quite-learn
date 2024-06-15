package B20240613.Bank;

import javax.swing.*;

public class Enroll extends JFrame{
    public Enroll(){
        //用户 姓名、 年龄、 存有的钱数、 借款钱数、 账号、 密码
        ui();

        this.setVisible(true);
    }

    private void ui() {
        this.setSize(400,600);
        this.setAlwaysOnTop(true);
        this.setTitle("银行 - 注册界面");
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }
}
