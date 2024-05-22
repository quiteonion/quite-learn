package LearnEnglish;

import javax.swing.*;

public class LearnJFrame extends JFrame {
    public LearnJFrame() {
        //设置宽高
        this.setSize(400,400);
        //设置标题
        this.setTitle("英语救星 学习 v1.0");
        //设置居中
        this.setLocationRelativeTo(null);
        //设置始终位于最上层
        this.setAlwaysOnTop(true);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

        //设置是否显示
        this.setVisible(true);
    }
}