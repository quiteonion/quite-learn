package B20240613.Bank;

import javax.swing.*;
import java.awt.*;

public class Enroll extends JFrame{
    public Enroll(){
        //用户 姓名、 年龄、 存有的钱数、 借款钱数、 账号、 密码
        ui();
        interior();
        this.setVisible(true);
    }

    private void interior() {
        //姓名
        nameJLabel();
        nameJTxtField();
        //年龄
        ageJLabel();
        ageJTxtField();
        //账号
        accountJLabel();
        accountTxtField();
        //密码
        passwordJLabel();
        passwordTxtField();
        //确认密码
        RpasswordJLabel();
        RpasswordTxtField();
        //注册按钮
        enrollButton();
        //已拥有账号？登录
        loginJLabel();
    }

    private void loginJLabel() {
        JLabel loginJLabel = new JLabel("已拥有账号？去登录");
        loginJLabel.setFont(new Font("宋体",Font.PLAIN , 12));
        loginJLabel.setBounds(250,400,150,40);
        loginJLabel.setForeground(Color.red);
        this.getContentPane().add(loginJLabel);
    }

    private void enrollButton() {
        JButton enrollButton = new JButton("注册");
        enrollButton.setFont(new Font("宋体",Font.PLAIN,20));
        JPanel enrollJPanel = new JPanel();
        enrollJPanel.add(enrollButton);
        enrollJPanel.setBounds(150,300,80,40);
        this.getContentPane().add(enrollJPanel);
    }

    private void RpasswordTxtField() {
        JTextField RpasswordjTextField = new JTextField();
        RpasswordjTextField.setBounds(125 , 238 ,200 , 25);
        this.getContentPane().add(RpasswordjTextField);
    }

    private void RpasswordJLabel() {
        JLabel RpasswordjLabel = new JLabel("确认密码");
        RpasswordjLabel.setFont(new Font("宋体",Font.PLAIN,20));
        RpasswordjLabel.setBounds(40,240,80,20);
        this.getContentPane().add(RpasswordjLabel);
    }

    private void passwordTxtField() {
        JTextField passwordjTextField = new JTextField();
        passwordjTextField.setBounds(125 , 198 ,200 , 25);
        this.getContentPane().add(passwordjTextField);
    }

    private void passwordJLabel() {
        JLabel passwordjLabel = new JLabel("密码");
        passwordjLabel.setFont(new Font("宋体",Font.PLAIN,20));
        passwordjLabel.setBounds(80,200,40,20);
        this.getContentPane().add(passwordjLabel);
    }

    private void accountTxtField() {
        JTextField accountjTextField = new JTextField();
        accountjTextField.setBounds(125 , 158 ,200 , 25);
        this.getContentPane().add(accountjTextField);
    }

    private void accountJLabel() {
        JLabel accountjLabel = new JLabel("账号");
        accountjLabel.setFont(new Font("宋体",Font.PLAIN,20));
        accountjLabel.setBounds(80,160,40,20);
        this.getContentPane().add(accountjLabel);
    }

    private void ageJTxtField() {
        JTextField agejTextField = new JTextField();
        agejTextField.setBounds(125 , 118 ,200 , 25);
        this.getContentPane().add(agejTextField);
    }

    private void ageJLabel() {
        JLabel ageJlabel = new JLabel("年龄");
        ageJlabel.setFont(new Font("宋体",Font.PLAIN,20));
        ageJlabel.setBounds(80,120,40,20);
        this.getContentPane().add(ageJlabel);
    }

    private void nameJTxtField() {
        JTextField namejTextField = new JTextField();
        namejTextField.setBounds(125 , 78 ,200 , 25);
        this.getContentPane().add(namejTextField);
    }

    private void nameJLabel() {
        JLabel namejLabel = new JLabel("姓名");
        namejLabel.setFont(new Font("宋体",Font.PLAIN,20));
        namejLabel.setBounds(80,80,40,20);
        this.getContentPane().add(namejLabel);
    }

    private void ui() {
        this.setSize(400,500);
        this.setAlwaysOnTop(true);
        this.setTitle("银行 - 注册界面");
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }
}
