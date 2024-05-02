package PinTuGame.com.onion.ui;

import javax.swing.*;

public class LoginJFrame  extends JFrame {
    public LoginJFrame(){
        this.setSize(488,430);
        this.setTitle("拼图 登录 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);//是否置顶（是）
        //设置界面出现位置居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);



        //使界面显示
        this.setVisible(true);
    }
}
