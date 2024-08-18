package dou_di_zhu.util;

import dou_di_zhu.Brand;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 工具类，用来打乱牌和整理每个人手上的牌
 */
public class BrandUtil {
    private static String[] colors = {"♠", "♥", "♦", "♣"};
    private static String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    public static Brand[] brands = new Brand[54];

    public static Brand[] createBrands() {
        int i = 0;
        for (int j = 0; j < numbers.length; j++) {
            for (int k = 0; k < colors.length; k++) {
                Brand brand = new Brand(colors[k], numbers[j]);
                brand.setInteger(i);
                brands[i++] = brand;
            }
        }
        brands[52] = new Brand(" ", "小鬼");
        brands[52].setInteger(52);
        brands[53] = new Brand(" ", "大鬼");
        brands[53].setInteger(53);
        return brands;
    }

    public static Brand[] shuffle() {
        if (brands[0] == null) {
            System.out.println("请先创建牌组才能进行打乱");
            return null;
        }
        List<Brand> brandList = new ArrayList<>();
        brandList.addAll(Arrays.asList(brands));
        Collections.shuffle(brandList);
        for (int i = 0; i < brands.length; i++) {
            brands[i] = brandList.get(i);
        }
        return brands;
    }

    public static boolean sort(Brand[] brands) {
        Arrays.sort(brands);
        return true;
    }

    public static List<Brand[]> deal(Brand[] brands) {
        List<Brand[]> list = new ArrayList<>();
        //三张地主牌
        Brand[] b0 = new Brand[3];
        //角色牌
        Brand[] b1 = new Brand[17];
        Brand[] b2 = new Brand[17];
        Brand[] b3 = new Brand[17];
        int l = 0, j = 0, k = 0;
        for (int i = 0; i < brands.length; i++) {
            if (i < 3) {
                b0[i] = brands[i];
                continue;
            }
            if (i % 3 == 0) {
                b1[l++] = brands[i];
            } else if (i % 3 == 1) {
                b2[j++] = brands[i];
            } else {
                b3[k++] = brands[i];
            }
        }
        list.add(b0);
        list.add(b1);
        list.add(b2);
        list.add(b3);
        return list;
    }

}
