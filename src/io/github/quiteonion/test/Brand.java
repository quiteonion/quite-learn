package io.github.quiteonion.test;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Brand extends Container{
    private String name;//拍的名称
    private boolean isGray;//是否置灰
    private Image image;//牌的地址
    private Image grayImage;//灰牌的地址

    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;

    public Brand(String name) {
        this.name = name;
        this.image = Toolkit.getDefaultToolkit().getImage("src/io/github/quiteonion/imgs/20240810182156/" + this.name + ".png");
        this.grayImage = Toolkit.getDefaultToolkit().getImage("src/io/github/quiteonion/imgs/20240810182156/" + this.name + "_gray.png");
        this.isGray = false;
        this.width = 50;
        this.height = 50;
        this.x = 0;
        this.y = 0;

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("鼠标点击了");
                Brand brand = (Brand) e.getSource();
                brand.getParent().remove(brand);
            }
        });
    }


    public String getName() {
        return this.name;
    }

    @Override
    public void paint(Graphics g) {
        if (this.isGray == true){
            g.drawImage(this.grayImage, this.x,this.y,null);
        }else {
            g.drawImage(this.image, this.x,this.y,null);

        }
    }
}
