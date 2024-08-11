package io.github.quiteonion.test;

import javax.swing.*;
import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

public class EliminateBox {
    private static List<Brand> list = new ArrayList<>();

    public void addSlot(Brand brand) {
        list.add(brand);
        list.sort(Comparator.comparing(Brand::getName));
        Map<String, List<Brand>> map = list.stream().collect(Collectors.groupingBy(Brand::getName));
        Set<String> set = map.keySet();
        for (String s : set) {
            List<Brand> brands = map.get(s);
            if (brands.size() == 3) {
                delete(s);
                break;
            }
        }
        paint();
        flag(brand);
    }

    void delete(String key) {
        Iterator<Brand> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Brand next = iterator.next();
            if (next.getName().equals(key)) {
                next.getParent().remove(next);
                iterator.remove();
            }
        }
    }

    public void flag(Brand brand) {
       if (list.size()>6){
           JOptionPane.showConfirmDialog(brand,"游戏结束");
           System.exit(0);
       }
    }


    public void paint() {
        for (int i = 0; i < list.size(); i++) {
            Brand brand = list.get(i);
            int x = i * brand.getWidth() + 10;
            brand.setBounds(x, 600, 50, 50);
        }
    }
}
