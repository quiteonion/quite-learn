package B20240613.Bank;

import A20240515.note.MysortUtilState.Print;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class MainInterface extends JFrame {

    static long ACCOUNT;
    static String NAME;
    static int AGE;
    static long MONEY;
    static ArrayList<User> Users = Login.Users;

    private void findUser() {
        for (User user : Users) { // 使用增强的for循环来简化代码
            if (user.getAccount() == ACCOUNT) {
                NAME = user.getName();
                AGE = user.getAge();
                MONEY = user.getMoneyNumber();
                break; // 找到后退出循环
            }
        }
        // 可能还需要处理未找到用户的情况
    }


    public MainInterface(long account) {
        ACCOUNT = account;
        findUser();
        ui();
        menu();
        interior();
        this.setVisible(true);
    }


    private void interior() {
        information();
    }

    private void information() {
        nameJLabel();
        ageJLabel();
        accountJLabel();
        moneyJLabel();
        borrowMoney();
    }

    private void borrowMoney() {
        JButton borrowMoneyButton = new JButton("借钱");
        borrowMoneyButton.setFont(new Font("宋体",Font.BOLD,35));
        borrowMoneyButton.setForeground(Color.YELLOW);
        borrowMoneyButton.setBackground(Color.RED);
        JPanel borrowMoneyJPanel = new JPanel();
        borrowMoneyJPanel.add(borrowMoneyButton);
        borrowMoneyJPanel.setBounds(200,400,400,200);
        this.getContentPane().add(borrowMoneyJPanel);
    }

    private void moneyJLabel() {
        JLabel moneyNumberJLabel = new JLabel(MONEY+"");
        moneyNumberJLabel.setFont(new Font("宋体",Font.BOLD,100));
        moneyNumberJLabel.setForeground(Color.RED);
        moneyNumberJLabel.setBounds(250,150,400,200);
        this.getContentPane().add(moneyNumberJLabel);
    }

    private void accountJLabel() {
        JLabel accountJLabel = new JLabel("账号:" + ACCOUNT);
        accountJLabel.setFont(new Font("宋体", Font.PLAIN, 30));
        accountJLabel.setBounds(550, 20, 200, 40);
        this.getContentPane().add(accountJLabel);
    }

    private void ageJLabel() {
        JLabel nameJLabel = new JLabel("年龄:" + AGE);
        nameJLabel.setFont(new Font("宋体", Font.PLAIN, 30));
        nameJLabel.setBounds(300, 25, 200, 40);
        this.getContentPane().add(nameJLabel);
    }

    private void nameJLabel() {
        JLabel nameJLabel = new JLabel("姓名:" + NAME);
        nameJLabel.setFont(new Font("宋体", Font.PLAIN, 30));
        nameJLabel.setBounds(10, 20, 200, 40);
        this.getContentPane().add(nameJLabel);
    }

    private void ui() {
        this.setSize(800, 600);
        this.setTitle("银行 - 主界面");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }

    private void menu() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu menujMenu = new JMenu("  菜单  ");
        JMenu functionjMenu = new JMenu("  功能  ");


        JMenuItem loginjMenuItem = new JMenuItem("  登录  ");
        JMenuItem enrolljMenuItem = new JMenuItem("  注册  ");
        JMenuItem exitjMenuItem = new JMenuItem("  退出  ");

        JMenuItem findjMenuItem = new JMenuItem("  查找  ");
        JMenuItem deletejMenuItem = new JMenuItem("  删除  ");

        enrolljMenuItem.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Enroll();
            }
        });

        loginjMenuItem.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });

        exitjMenuItem.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("关闭程序");
                System.exit(0);
            }
        });

        menujMenu.add(loginjMenuItem);
        menujMenu.add(enrolljMenuItem);
        menujMenu.add(exitjMenuItem);

        functionjMenu.add(findjMenuItem);
        functionjMenu.add(deletejMenuItem);



        jMenuBar.add(menujMenu);
        jMenuBar.add(functionjMenu);
        this.setJMenuBar(jMenuBar);

    }
}
