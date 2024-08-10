package io.github.quiteonion.test;

import java.util.*;

public class Test {
    public static Random r = new Random();
    public static String[] brandNames = {
            "假面骑士", "地狱火", "带土", "羊", "鸡哥"
    };

    public static String getBrand() {
        int i = r.nextInt(brandNames.length);
        return brandNames[i];
    }

    public static void main(String[] args) {
        List<Brand> brandList = new ArrayList<>();
        Layer layer = new Layer(6, 6);
        Brand[] brands = new Brand[layer.getCapacity()];
        for (int i = 0; i < brands.length; i++) {
            String name = getBrand();
            Brand brand1 = new Brand(name);
            Brand brand2 = new Brand(name);
            Brand brand3 = new Brand(name);
            brandList.add(brand1);
            brandList.add(brand2);
            brandList.add(brand3);
        }
        Collections.shuffle(brandList);
        for (int i = 0; i < brands.length; i++) {
            brands[i] = brandList.get(i);
        }
        int number = 0;
        Cell[][] cells = layer.getCells();
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                Cell cell = new Cell();
                cell.setState(1);
                cell.setBrand(brands[number++]);

                cells[row][col] = cell;
            }
        }
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                System.out.println(cells[row][col].getBrand().getName());
            }
        }
    }
}


