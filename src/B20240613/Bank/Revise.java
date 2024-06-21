package B20240613.Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import static B20240613.Bank.MainInterface.*;

public class Revise extends JFrame {
    static String S;
    static String name;
    static String password;
    static JTextField jTextField;

    public Revise(String s) {
        S = s;
        ui();
        revise();
        setVisible(true);
    }

    private void revise() {
        JLabel jLabel = new JLabel("您要修改的新" + S + "为：");
        jLabel.setFont(new Font("宋体", Font.PLAIN, 25));
        jLabel.setBounds(20, 30, 400, 40);
        this.getContentPane().add(jLabel);

        jTextField = new JTextField();
        jTextField.setFont(new Font("宋体", Font.PLAIN, 60));
        jTextField.setBounds(100, 120, 400, 65);
        this.getContentPane().add(jTextField);

        JButton jButton = new JButton("修改");
        jButton.setFont(new Font("宋体", Font.PLAIN, 35));
        JPanel jPanel = new JPanel();
        jPanel.add(jButton);
        jPanel.setBounds(200, 250, 200, 70);
        this.getContentPane().add(jPanel);



            jButton.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent ex) {
                    if ("名称".equals(S)) {
                        name = jTextField.getText();
                        password = PASSWORD;
                    }
                    else if ("密码".equals(S)){
                        password = jTextField.getText();
                        name = NAMEQ;
                    }

                    String fileName = "src/B20240613/Bank/user.properties";
                    String keyToUpdate = String.valueOf(ACCOUNT); // 要更新的键
                    String newValue = name + "\t" + AGE + "\t" + password + "\t" + MONEY; // 新的值

                    Properties properties = new Properties();
                    try (FileInputStream fis = new FileInputStream(fileName)) {
                        // 加载旧文件的内容
                        properties.load(fis);

                        // 检查键是否存在并更新其值
                        if (properties.containsKey(keyToUpdate)) {
                            properties.setProperty(keyToUpdate, newValue);
                        }
                        // 将修改后的内容写回文件
                        try (FileOutputStream fos = new FileOutputStream(fileName)) {
                            properties.store(fos, "Updated properties file");
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    new Login();
                    dispose();
                }
            });
        }

    private void ui () {
        this.setSize(600, 400);
        this.setTitle("银行 - 修改信息");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(2);
        this.setLayout(null);
    }
}