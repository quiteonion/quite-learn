package A20240131;

import java.util.Scanner;

public class Telephone {
    private String brand;
    private int price;
    private String color;
    public Telephone(){
    }
    public Telephone(String brand,int price , String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public void play(String brand){
        System.out.println("我在玩我的" + brand);
    }
    public void connnection(){
        System.out.println("正在打电话");
    }
}
