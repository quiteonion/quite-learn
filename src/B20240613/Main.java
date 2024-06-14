package B20240613;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

import javax.swing.*;
import java.awt.*;

import javax.swing.*;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // 创建一个JFrame实例
        JFrame frame = new JFrame("TextField Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // 创建一个JTextField实例
        JTextField textField = new JTextField("Hello, World!");

        // 创建一个LineBorder实例，并设置边框宽度和颜色
        LineBorder lineBorder = new LineBorder(Color.RED, 2); // 红色，2像素宽

        // 将LineBorder应用到JTextField上
        textField.setBorder(lineBorder);

        // 将文本框添加到JFrame的内容面板中
        frame.getContentPane().add(textField, BorderLayout.CENTER);

        // 设置JFrame可见
        frame.setVisible(true);
    }
}
/*
public class Main {

    public static void main(String[] args) {
        // 1. 创建 JFrame 实例
        JFrame frame = new JFrame("Input in JFrame Example");

        // 2. 设置 JFrame 属性
        frame.setSize(300, 200); // 设置大小
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭操作

        // 3. 添加 JTextField
        JTextField textField = new JTextField(20); // 创建一个 JTextField，宽度为 20 个字符
        frame.getContentPane().add(textField, BorderLayout.CENTER); // 将 JTextField 添加到内容面板的中心位置

        // 4. 设置 JFrame 可见
        frame.setVisible(true);
    }
}*/
