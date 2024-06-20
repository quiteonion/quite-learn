package B20240613.Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;

public class Enroll extends JFrame {
    static String fileName = "src/B20240613/Bank/user.properties";
    static ArrayList<User> Users = Login.Users;

    static {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            properties.load(fis); // 从文件中加载属性
        } catch (IOException e) {
            e.printStackTrace();
            // 处理异常，可能需要退出程序或提供备选方案
        }

        // 遍历Properties的键集合
        for (String account : properties.stringPropertyNames()) { // 使用stringPropertyNames()获取所有字符串键
            String userInfo = properties.getProperty(account); // 获取与账号关联的用户信息
            if (userInfo != null && !userInfo.isEmpty()) {
                String[] fields = userInfo.split("\\t"); // 使用制表符分割字段
                if (fields.length == 3) {
                    String name = fields[0];
                    String ageStr = fields[1];
                    String password = fields[2];
                    String moneyNumber = fields[3];
                    int age = Integer.parseInt(ageStr); // 假设年龄是整数
                    long id = Long.parseLong(account); // 假设账号是用户的ID，并且是长整型
                    long money = Long.parseLong(moneyNumber);
                    User user = new User(name,age,id,password , money);
                    Users.add(user);
                }
            }
        }
    }



    private JTextField namejTextField;
    private JTextField agejTextField;
    private JTextField accountjTextField;
    private JTextField passwordjTextField;
    private JTextField RpasswordjTextField;

    public Enroll() {
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
        loginJLabel.setFont(new Font("宋体", Font.PLAIN, 12));
        loginJLabel.setBounds(250, 400, 150, 40);
        loginJLabel.setForeground(Color.red);
        this.getContentPane().add(loginJLabel);
        loginJLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 检查是否是左键点击
                if (e.getButton() == MouseEvent.BUTTON1) {
                    // 在这里处理点击事件
                    setVisible(false);
                    new Login();
                }
            }
        });
    }

    private void enrollButton() {

        JButton enrollButton = new JButton("注册");
        enrollButton.setFont(new Font("宋体", Font.PLAIN, 20));
        JPanel enrollJPanel = new JPanel();
        enrollJPanel.add(enrollButton);
        enrollJPanel.setBounds(150, 300, 80, 40);
        this.getContentPane().add(enrollJPanel);
        // ... 省略了其他代码 ...

        enrollButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = namejTextField.getText();
                String age = agejTextField.getText();
                String account = accountjTextField.getText();
                String password = passwordjTextField.getText();
                String Rpassword = RpasswordjTextField.getText();

                // 假设judgment方法用于验证输入的有效性
                boolean flag = judgment(name, age, account, password);
                if (!flag) {
                    // 如果验证失败，直接返回或显示错误消息
                    // ... 省略了错误处理代码 ...
                    return;
                }

                // 准备要写入文件的新用户信息
                String userInfo = name + "\t" + age + "\t" + password;

                // 指定文件路径
                String fileName = "src/B20240613/Bank/user.properties";

                try (FileWriter writer = new FileWriter(fileName, true)) { // 使用true参数表示追加模式
                    // 将新用户信息写入文件，注意这里不使用Properties对象
                    writer.write(account + "=" + userInfo + System.lineSeparator());
                    writer.flush(); // 确保写入操作完成

                    // 如果需要，可以在这里重新加载Properties对象，但通常这不会在注册时发生
                    // ... 省略了重新加载Properties对象的代码 ...

                    // 关闭当前窗口并显示成功消息
                    setVisible(false);
                    new Good("注册"); // 假设Good是一个显示成功消息的窗口或对话框
                } catch (IOException ex) {
                    ex.printStackTrace();
                    // 处理文件写入错误
                }
            }
        });

// ... 省略了其他代码 ...

    }

    private boolean judgment(String... arr) {
        for (int i = 0; i < arr.length; i++) {
            if ("".equals(arr[i]))
                return false;
        }
        for (int i = 0; i < arr[0].length(); i++) {
            if (arr[0].charAt(i) > '0' && arr[0].charAt(i) < '9') {
                return false;
            }
        }
        for (int i = 0; i < arr[1].length(); i++) {
            if (!(arr[1].charAt(i) > '0' && arr[1].charAt(i) < '9')) {
                return false;
            }
        }
        for (int i = 0; i < arr[2].length(); i++) {
            if (!(arr[2].charAt(i) > '0' && arr[2].charAt(i) < '9')) {
                return false;
            }
        }
        if (!(arr[3].equals(arr[4]))) {
            return false;
        }
        User user = new User(arr[0], Integer.valueOf(arr[1]), Long.valueOf(arr[2]), arr[3],0);
        Users.add(user);
        return true;
    }


    private void RpasswordTxtField() {
        RpasswordjTextField = new JTextField();
        RpasswordjTextField.setBounds(125, 238, 200, 25);
        this.getContentPane().add(RpasswordjTextField);
    }

    private void RpasswordJLabel() {
        JLabel RpasswordjLabel = new JLabel("确认密码");
        RpasswordjLabel.setFont(new Font("宋体", Font.PLAIN, 20));
        RpasswordjLabel.setBounds(40, 240, 80, 20);
        this.getContentPane().add(RpasswordjLabel);
    }

    private void passwordTxtField() {
        passwordjTextField = new JTextField();
        passwordjTextField.setBounds(125, 198, 200, 25);
        this.getContentPane().add(passwordjTextField);
    }

    private void passwordJLabel() {
        JLabel passwordjLabel = new JLabel("密码");
        passwordjLabel.setFont(new Font("宋体", Font.PLAIN, 20));
        passwordjLabel.setBounds(80, 200, 40, 20);
        this.getContentPane().add(passwordjLabel);
    }

    private void accountTxtField() {
        accountjTextField = new JTextField();
        accountjTextField.setBounds(125, 158, 200, 25);
        this.getContentPane().add(accountjTextField);
    }

    private void accountJLabel() {
        JLabel accountjLabel = new JLabel("账号");
        accountjLabel.setFont(new Font("宋体", Font.PLAIN, 20));
        accountjLabel.setBounds(80, 160, 40, 20);
        this.getContentPane().add(accountjLabel);
    }

    private void ageJTxtField() {
        agejTextField = new JTextField();
        agejTextField.setBounds(125, 118, 200, 25);
        this.getContentPane().add(agejTextField);
    }

    private void ageJLabel() {
        JLabel ageJlabel = new JLabel("年龄");
        ageJlabel.setFont(new Font("宋体", Font.PLAIN, 20));
        ageJlabel.setBounds(80, 120, 40, 20);
        this.getContentPane().add(ageJlabel);
    }

    private void nameJTxtField() {
        namejTextField = new JTextField();
        namejTextField.setBounds(125, 78, 200, 25);
        this.getContentPane().add(namejTextField);
    }

    private void nameJLabel() {
        JLabel namejLabel = new JLabel("姓名");
        namejLabel.setFont(new Font("宋体", Font.PLAIN, 20));
        namejLabel.setBounds(80, 80, 40, 20);
        this.getContentPane().add(namejLabel);
    }

    private void ui() {
        this.setSize(400, 500);
        this.setAlwaysOnTop(true);
        this.setTitle("银行 - 注册界面");
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }
}
