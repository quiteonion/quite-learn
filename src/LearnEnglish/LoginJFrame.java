package LearnEnglish;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame(){
        //设置宽高
        this.setSize(400 , 400);
        //设置标题
        this.setTitle("英语救星 登录 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面在出现时居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

        //设置让界面显示出来 ， 最好放在最后
        this.setVisible(true);
    }
}
