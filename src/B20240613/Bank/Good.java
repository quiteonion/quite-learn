
package B20240613.Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Good extends JFrame {
    private static String login = "登录";
    private static String enroll = "注册";

    public Good(String s) {
        ui();
        returnButton(s);
        textDis(s);
        setVisible(true);
    }

    private void textDis(String s) {
        String num = null;
        if (s.equals(login)) {
            num = login;
        } else if (s.equals(enroll)) {
            num = enroll;
        }
        JLabel jLabel = new JLabel(num + "成功");
        jLabel.setFont(new Font("宋体", Font.PLAIN, 30));
        jLabel.setForeground(Color.red);
        jLabel.setBounds(100, 10, 400, 100);
        this.getContentPane().add(jLabel);
    }

    private void returnButton(String s) {
        String num = null;
        if (s.equals(enroll)) {
            num = enroll;
        } else if (s.equals(login)) {
            num = login;
        }
        JButton jButton = new JButton("返回" + num);
        jButton.setFont(new Font("宋体", Font.PLAIN, 20));
        JPanel jPanel = new JPanel();
        jPanel.add(jButton);
        jPanel.setBounds(90, 100, 200, 80);
        this.getContentPane().add(jPanel);
        if (s.equals(login)) {
            jButton.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    new Login();
                }
            });
        } else if (s.equals(enroll)) {
            jButton.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    new Enroll();
                }
            });
        }
    }

    private void ui() {
        this.setSize(400, 200);
        this.setTitle("警告");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }
}
