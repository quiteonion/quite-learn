package B20240613.Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Login extends JFrame {
    static ArrayList<User> Users = Enroll.Users;
    private JTextField enrolljTextField;
    private JTextField loginjTextField ;

    public Login(){
        ui();
        interior();
        this.setVisible(true);
    }

    private void interior() {
        touxiang();
        enrollSet();
        loginSet();
        loginButton();
        enrollButton();
    }

    private void enrollButton() {
        JLabel enrolljLabel = new JLabel("没有账号？去注册");
        enrolljLabel.setForeground(Color.red);
        enrolljLabel.setBounds(900,680,200,50);
        enrolljLabel.setFont(new Font("宋体" , Font.PLAIN,13));
        this.getContentPane().add(enrolljLabel);
        enrolljLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 检查是否是左键点击
                if (e.getButton() == MouseEvent.BUTTON1) {
                    // 在这里处理点击事件
                    setVisible(false);
                    new Enroll();
                }
            }
        });
    }


    private void loginButton() {
        JButton loginjButton = new JButton("登录");
        loginjButton.setFont(new Font("宋体", Font.PLAIN, 30));
        JPanel loginjPanel = new JPanel();
        loginjPanel.add(loginjButton);
        loginjPanel.setBounds(470,630,105,60);
        this.getContentPane().add(loginjPanel);

        loginjButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < Users.size(); i++) {
                    if(Users.get(i).getAccount() == Integer.valueOf(enrolljTextField.getText())){
                        if (Users.get(i).getPassword().equals(loginjTextField.getText())){
                            setVisible(false);
                            new MainInterface();
                            return;
                        }
                    }
                }
                setVisible(false);
                new Bad("登录");
            }
        });
    }

    private void touxiang() {
        ImageIcon touxiang = new ImageIcon("src/B20240613/Img/TouXiang.png");
        JLabel touxiangjLabel = new JLabel(touxiang);
        touxiangjLabel.setBounds(330,20 , 400,400);
        this.getContentPane().add(touxiangjLabel);

    }

    public void loginSet(){
        JLabel  login = new JLabel("密码");
        login.setFont(new Font("宋体", Font.PLAIN, 35));
        login.setBounds(300,555,90,40);

        loginjTextField = new JTextField();
        loginjTextField.setFont(new Font("Arial",Font.PLAIN , 30));
        loginjTextField.setBounds(375,550,350,50);
        this.getContentPane().add(login);
        this.getContentPane().add(loginjTextField);
    }
    public void enrollSet(){
        JLabel enroll = new JLabel("账号");
        enroll.setFont(new Font("宋体", Font.PLAIN, 35));
        enroll.setBounds(300 ,455,90,40);

        enrolljTextField = new JTextField();
        enrolljTextField.setFont(new Font("Arial",Font.PLAIN , 30));
        enrolljTextField.setBounds(375,450,350,50);
        this.getContentPane().add(enroll);
        this.getContentPane().add(enrolljTextField);
    }

    private void ui(){
        this.setSize(1050,800);
        this.setTitle("银行 - 登录界面");
        this.setAlwaysOnTop(true);
        //界面居中
        this.setLocationRelativeTo(null);
        //设置界面关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认放置
        this.setLayout(null);
    }

}
