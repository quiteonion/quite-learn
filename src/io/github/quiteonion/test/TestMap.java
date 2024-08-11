package io.github.quiteonion.test;

import javax.swing.*;
import java.util.List;

public class TestMap extends JFrame{
    private Map map = MapUtil.buildMap(3);
    public TestMap() {
        init();

        List<Layer> list = map.getList();
        for (int i = 0; i < list.size(); i++) {
            Layer layer = list.get(i);
            renderLayer(layer);
        }


        autoRefresh();
    }

    private void renderLayer(Layer layer) {
        Cell[][] cells = layer.getCells();
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                Brand brand = cells[row][col].getBrand();
                int x = row * 50;
                int y = col * 50;
                brand.setBounds(x, y, 50, 50);
                this.getContentPane().add(brand);
            }
        }
    }

    private void init() {
        this.setTitle("呆了个呆");
        this.setSize(450, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(null);
        this.setBounds(0, 0, 450, 800);
        this.setLocationRelativeTo(null);

        this.setVisible(true);
    }

    private void autoRefresh() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
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


}
