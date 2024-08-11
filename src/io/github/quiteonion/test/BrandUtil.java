package io.github.quiteonion.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BrandUtil {
    public static Random r = new Random();
    public static String[] brandNames = {
            "假面骑士", "地狱火", "带土", "羊", "鸡哥","一豪十分开心","什么东东","巧V嚣张跋扈","模糊巧","精神力MAX","老师豪","连麦宇将军"
    };

    public static String getBrand() {
        int i = r.nextInt(brandNames.length);
        return brandNames[i];
    }

    public static Brand[] buildBrands(Integer capacity) {
        List<Brand> brandList = new ArrayList<>();
        Brand[] brands = new Brand[capacity];
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
        return brands;
    }
}
