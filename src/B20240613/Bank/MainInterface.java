package B20240613.Bank;

import A20240515.note.MysortUtilState.Print;

import javax.swing.*;
import java.awt.*;

public class MainInterface extends JFrame {
    public MainInterface(){
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
    }

    private void ageJLabel() {
        JLabel nameJLabel = new JLabel("年龄:");
        nameJLabel.setFont(new Font("宋体" , Font.PLAIN,20));
        nameJLabel.setBounds(130,10,60,20);
        this.getContentPane().add(nameJLabel);
    }

    private void nameJLabel() {
        JLabel nameJLabel = new JLabel("姓名:");
        nameJLabel.setFont(new Font("宋体" , Font.PLAIN,20));
        nameJLabel.setBounds(10,10,60,20);
        this.getContentPane().add(nameJLabel);
    }

    private void ui() {
        this.setSize(800,600);
        this.setTitle("银行 - 主界面");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }

    private void menu(){
        JMenuBar jMenuBar = new JMenuBar();

        JMenu menujMenu = new JMenu("  菜单  ");
        JMenu functionjMenu = new JMenu("  功能  ");
        JMenu exitjMenu = new JMenu("  退出  ");

        JMenuItem loginjMenuItem = new JMenuItem("  登录  ");
        JMenuItem enrolljMenuItem = new JMenuItem("  注册  ");

        JMenuItem findjMenuItem = new JMenuItem("  查找  ");
        JMenuItem revisejMenuItem = new JMenuItem("  修改  ");
        JMenuItem deletejMenuItem = new JMenuItem("  删除  ");

        menujMenu.add(loginjMenuItem);
        menujMenu.add(enrolljMenuItem);

        functionjMenu.add(findjMenuItem);
        functionjMenu.add(revisejMenuItem);
        functionjMenu.add(deletejMenuItem);


        jMenuBar.add(menujMenu);
        jMenuBar.add(functionjMenu);
        jMenuBar.add(exitjMenu);
        this.setJMenuBar(jMenuBar);

    }
}
