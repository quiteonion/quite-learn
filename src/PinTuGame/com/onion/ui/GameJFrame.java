package PinTuGame.com.onion.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame(){
        initJFrame();
        initJMenuBar();
        //加载图片的方法
        initImg();
        //使界面显示
        this.setVisible(true);
    }

    private void initImg() {
        //创立一个 ImageIcon 的对象
        ImageIcon icon = new ImageIcon("D:\\idea\\idea 存储\\quite\\src\\PinTuGame\\Img\\WenFengALL\\1.png");
        //创建 JLabel 的对象  ）管理容器（
        // 吧 ImageIcon 加入 JLabel 中
        JLabel jLabel = new JLabel(icon);
        //加入界面中
        this.add(jLabel);
    }

    private void initJMenuBar() {
        //创建菜单对象 JMenuBar
        JMenuBar jMenuBar = new JMenuBar();

        //创建 JMenu
        //括号内是要表示的文字
        JMenu functionjMenu = new JMenu("功能");
        JMenu aboutjMenu = new JMenu("关于我们");

        //创建 JMenuItem
        JMenuItem rePlayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登陆");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem about = new JMenuItem("关于我");

        functionjMenu.add(rePlayItem);
        functionjMenu.add(reLoginItem);
        functionjMenu.add(closeItem);

        aboutjMenu.add(about);

        jMenuBar.add(functionjMenu);
        jMenuBar.add(aboutjMenu);

        //设置菜单
        this.setJMenuBar(jMenuBar);
    }
    private void initJFrame(){
        //设置界面宽高
        this.setSize(603,680);
        //设置界面标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);//是否置顶（是）
        //设置界面出现位置居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
    }

}
