package PinTuGame.com.onion.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        initJFrame();
        initJMenuBar();
        //加载图片的方法
        initImg();
        //使界面显示
        this.setVisible(true);
    }

    private void initImg() {

/**
 * 太复杂切长，要用循环改进
 * */

//        ImageIcon icon1 = new ImageIcon("D:\\idea\\idea 存储\\quite\\src\\PinTuGame\\PinTuImg\\NaChuanALL_420x420\\2.png");
//        JLabel jLabel1 = new JLabel(icon1);
//        jLabel1.setBounds(105,0,105,105);
//        this.getContentPane().add(jLabel1);
//
//        ImageIcon icon2 = new ImageIcon("D:\\idea\\idea 存储\\quite\\src\\PinTuGame\\PinTuImg\\NaChuanALL_420x420\\3.png");
//        JLabel jLabel2 = new JLabel(icon2);
//        jLabel2.setBounds(210,0,105,105);
//        this.getContentPane().add(jLabel2);

        /*        String dizhi ="D:\\idea\\idea 存储\\quite\\src\\PinTuGame\\PinTuImg\\NaChuanALL_420x420\\";
        String[][] arr ={
                {dizhi+"1.png","dizhi2.png","dizhi3.png","dizhi4.png"},
                {"dizhi5.png","dizhi6.png","dizhi7.png","dizhi8.png"},
                {"dizhi9.png","dizhi10.png","dizhi11.png","dizhi12.png"},
                {"dizhi13.png","dizhi14.png","dizhi15.png","dizhiimg.png"}
        };*/
        int[] temp = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[][] newTemp = dislocateTemp(temp);
//        int number = 1;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {

                //创立一个 ImageIcon 的对象
                ImageIcon icon = new ImageIcon("D:\\idea\\idea 存储\\quite\\src\\PinTuGame\\PinTuImg\\YaoFengALL_420x420\\" + newTemp[j][i] + ".png");
                //创建 JLabel 的对象  ）管理容器（
                // 吧 ImageIcon 加入 JLabel 中
                JLabel jLabel = new JLabel(icon);
                //指定图片位置
                jLabel.setBounds(105 * i, 105 * j, 105, 105);
                this.getContentPane().add(jLabel);
                //加入界面中
                this.add(jLabel);
//                number++;
            }
        }


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

    private void initJFrame() {
        //设置界面宽高
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);//是否置顶（是）
        //设置界面出现位置居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

        //取消默认的居中放置，取消了才能按照x，y放置
        this.setLayout(null);
    }

    private int[][] dislocateTemp(int[] temp) {
        Random r = new Random();

        for (int i = 0; i < temp.length; i++) {
            int number = r.nextInt(temp.length);
            int mun = temp[i];
            temp[i] = temp[number];
            temp[number] = mun;
        }
        int[][] arr = new int[4][4];
/*        int o = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = temp[o];
                o++;
            }
        }*/
        for (int i = 0; i < temp.length; i++) {
            arr[i/4][i%4] =  temp[i];
        }
        return arr;
    }

}
