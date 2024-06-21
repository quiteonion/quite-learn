package B20240613.Bank;

import A20240515.note.MysortUtilState.Print;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class MainInterface extends JFrame {
    static long ACCOUNT;
    static String NAMEQ;
    static int AGE;
    static long MONEY;
    static String PASSWORD;
    static ArrayList<User> Users = Login.Users;


    private void findUser() {
        for (User user : Users) { // 使用增强的for循环来简化代码
            if (user.getAccount() == ACCOUNT) {
                NAMEQ = user.getName();
                AGE = user.getAge();
                MONEY = user.getMoneyNumber();
                PASSWORD = user.getPassword();
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
        borrowMoneyButton.setFont(new Font("宋体", Font.BOLD, 35));
        borrowMoneyButton.setForeground(Color.YELLOW);
        borrowMoneyButton.setBackground(Color.RED);
        JPanel borrowMoneyJPanel = new JPanel();
        borrowMoneyJPanel.add(borrowMoneyButton);
        borrowMoneyJPanel.setBounds(200, 400, 400, 200);
        this.getContentPane().add(borrowMoneyJPanel);

        borrowMoneyButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent ec) {
                MONEY = MONEY + 1000;
                String fileName = "src/B20240613/Bank/user.properties";
                String keyToUpdate = String.valueOf(ACCOUNT); // 要更新的键
                String newValue = NAMEQ + "\t" + AGE + "\t" + PASSWORD + "\t" + MONEY; // 新的值

                Properties properties = new Properties();
                try (FileInputStream fis = new FileInputStream(fileName)) {
                    // 加载旧文件的内容
                    properties.load(fis);

                    // 检查键是否存在并更新其值
                    if (properties.containsKey(keyToUpdate)) {
                        properties.setProperty(keyToUpdate, newValue);
                        System.out.println("Key '" + keyToUpdate + "' found and updated to '" + newValue + "'.");
                    } else {
                        System.out.println("Key '" + keyToUpdate + "' not found in the properties file.");
                    }

                    // 将修改后的内容写回文件
                    try (FileOutputStream fos = new FileOutputStream(fileName)) {
                        properties.store(fos, "Updated properties file");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void moneyJLabel() {
        JLabel moneyNumberJLabel = new JLabel(MONEY + "");
        moneyNumberJLabel.setFont(new Font("宋体", Font.BOLD, 100));
        moneyNumberJLabel.setForeground(Color.RED);
        moneyNumberJLabel.setBounds(250, 150, 400, 200);
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
        JLabel nameJLabel = new JLabel("姓名:" + NAMEQ);
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


        //JMenuItem deletejMenuItem = new JMenuItem("  注销  ");
        //转账

        /**
         * 贷款管理（如果系统支持贷款业务）：
         * 贷款申请：允许用户提交贷款申请，并填写必要的信息，如贷款金额、贷款期限等。
         * 贷款审批：对贷款申请进行审批，并通知用户审批结果。
         * 贷款还款：允许用户进行贷款还款操作。
         *
         */
        JMenuItem reviseNamejMenuItem = new JMenuItem("  修改姓名  ");
        JMenuItem revisePasswordjMenuItem = new JMenuItem("  修改密码  ");
        JMenuItem deletejMenuItem = new JMenuItem("  注销  ");

        revisePasswordjMenuItem.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Revise("密码");
            }
        });

        reviseNamejMenuItem.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Revise("名称");
            }
        });

        deletejMenuItem.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove();
                setVisible(false);
                new Login();
            }
        });

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

        functionjMenu.add(reviseNamejMenuItem);
        functionjMenu.add(revisePasswordjMenuItem);
        functionjMenu.add(deletejMenuItem);


        jMenuBar.add(menujMenu);
        jMenuBar.add(functionjMenu);
        this.setJMenuBar(jMenuBar);

    }

    private void remove() {
        String fileName = "src/B20240613/Bank/user.properties";
        String keyToRemove = String.valueOf(ACCOUNT); // 要删除的键

        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            // 加载旧文件的内容
            properties.load(fis);

            // 移除指定的键
            properties.remove(keyToRemove);

            // 将修改后的内容写回文件
            try (FileOutputStream fos = new FileOutputStream(fileName)) {
                properties.store(fos, "Updated properties file");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
