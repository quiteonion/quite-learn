package LearnEnglish;

import javax.swing.*;

public class LearnJFrame extends JFrame {
    public LearnJFrame() {
        setJFrame();
        setJMenuBar();

        //设置是否显示
        this.setVisible(true);
    }
    public void setJFrame(){
        //设置宽高
        this.setSize(800, 800);
        //设置标题
        this.setTitle("英语救星 学习 v1.0");
        //设置居中
        this.setLocationRelativeTo(null);
        //设置始终位于最上层
        this.setAlwaysOnTop(true);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //设置菜单界面
    }
    public void setJMenuBar(){
        // === 总菜单 ===
        JMenuBar jMenuBar = new JMenuBar();
//      === === === === === === === === === === === === === ===
        //功能菜单
        JMenu functionJMenu = new JMenu("功能菜单");
        //分类菜单
        JMenu categoryJMenu = new JMenu("分类菜单");
        //关于我们
        JMenu aboutUsJMenu = new JMenu("关于我们");
//      === === === === === === === === === === === === === ===
        JMenuItem anewJMenuItem = new JMenuItem("重新");
        JMenuItem learnJMenuItem = new JMenuItem("学习");
        JMenuItem testJMenuItem = new JMenuItem("测试");
        JMenuItem timeJMenuItem = new JMenuItem("时间统计");
        JMenuItem wrongJMenuItem = new JMenuItem("错词本");
        JMenuItem dictionaryJMenuItem = new JMenuItem("字典查找");
        JMenuItem exitJMenuItem = new JMenuItem("离开");

        JMenuItem a = new JMenuItem("初中 - 顺序");
        JMenuItem b = new JMenuItem("高中 - 顺序");
        JMenuItem c = new JMenuItem("CET4 - 顺序");
        JMenuItem d = new JMenuItem("CET6 - 顺序");
        JMenuItem e = new JMenuItem("考研 - 顺序");
        JMenuItem f = new JMenuItem("托福 - 顺序");
        JMenuItem g = new JMenuItem("SAT - 顺序");
        JMenuItem space = new JMenuItem("=== ===");
        JMenuItem aa = new JMenuItem("初中 - 乱序");
        JMenuItem bb = new JMenuItem("高中 - 乱序");
        JMenuItem cc = new JMenuItem("CET4 - 乱序");
        JMenuItem dd = new JMenuItem("CET6 - 乱序");
        JMenuItem ee = new JMenuItem("考研 - 乱序");
        JMenuItem ff = new JMenuItem("托福 - 乱序");
        JMenuItem gg = new JMenuItem("SAT - 乱序");

        JMenuItem aboutUs = new JMenuItem("制作团队");

        jMenuBar.add(functionJMenu);
        jMenuBar.add(categoryJMenu);
        jMenuBar.add(aboutUsJMenu);

        functionJMenu.add(anewJMenuItem);
        functionJMenu.add(learnJMenuItem);
        functionJMenu.add(testJMenuItem);
        functionJMenu.add(timeJMenuItem);
        functionJMenu.add(wrongJMenuItem);
        functionJMenu.add(dictionaryJMenuItem);
        functionJMenu.add(exitJMenuItem);

        categoryJMenu.add(a);
        categoryJMenu.add(b);
        categoryJMenu.add(c);
        categoryJMenu.add(d);
        categoryJMenu.add(e);
        categoryJMenu.add(f);
        categoryJMenu.add(g);
        categoryJMenu.add(space);
        categoryJMenu.add(aa);
        categoryJMenu.add(bb);
        categoryJMenu.add(cc);
        categoryJMenu.add(dd);
        categoryJMenu.add(ee);
        categoryJMenu.add(ff);
        categoryJMenu.add(gg);

        this.setJMenuBar(jMenuBar);
    }
}