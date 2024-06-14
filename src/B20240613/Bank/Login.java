package B20240613.Bank;

import javax.swing.*;

public class Login {
    public Login(){
        JFrame loginjFrame = new JFrame();
        loginjFrame.setSize(1050,800);
        loginjFrame.setTitle("银行 - 登录界面");
        loginjFrame.setAlwaysOnTop(true);
        //界面居中
        loginjFrame.setLocationRelativeTo(null);
        //设置界面关闭模式
        loginjFrame.setDefaultCloseOperation(2);


        loginjFrame.setVisible(true);
    }
}
