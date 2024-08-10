package io.github.quiteonion.test;

import java.util.Random;

public class BrandUtil {
    public static Random r = new Random();
    public static String[] brandNames = {
            "假面骑士", "地狱火", "带土", "羊", "鸡哥"
    };

    public static String getBrand() {
        int i = r.nextInt(brandNames.length);
        return brandNames[i];
    }
}
