package B20240613.Bank;

import javax.swing.*;

public class Login {
    public Login(){

    }
    private void ui(){
        JFrame loginjFrame = new JFrame();
        loginjFrame.setSize(1050,800);
        loginjFrame.setTitle("银行 - 登录界面");
        loginjFrame.setAlwaysOnTop(true);
        //界面居中
        loginjFrame.setLocationRelativeTo(null);
        //设置界面关闭模式
        loginjFrame.setDefaultCloseOperation(3);
        menu();

        loginjFrame.setVisible(true);
    }
    private void menu(){
        
    }
}
