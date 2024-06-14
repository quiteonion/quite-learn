package B20240613.Bank;

import javax.swing.*;

public class Login extends JFrame{
    public Login(){
        ui();

        this.setVisible(true);
    }
    private void ui(){
        this.setSize(1050,800);
        this.setTitle("银行 - 登录界面");
        this.setAlwaysOnTop(true);
        //界面居中
        this.setLocationRelativeTo(null);
        //设置界面关闭模式
        this.setDefaultCloseOperation(3);
        menu();


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
