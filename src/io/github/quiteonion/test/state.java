package io.github.quiteonion.test;

import javax.swing.*;
import java.awt.*;

public class state extends JFrame {
    public state() throws HeadlessException {
        Brand b = new Brand("地狱火");
        this.setTitle("呆了个呆");
        this.setSize(400, 800);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(b);
        this.setVisible(true);
        autoRefresh();
    }
    private void autoRefresh(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    repaint();
                    try {
                        Thread.sleep(40);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }
    public static void main(String[] args) {
        new state();
    }
}
