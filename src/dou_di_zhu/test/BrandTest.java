package dou_di_zhu.test;

import dou_di_zhu.Brand;
import dou_di_zhu.util.BrandUtil;

import java.util.Arrays;
import java.util.List;

public class BrandTest {
    public static void main(String[] args) {
        Brand[] brands = BrandUtil.createBrands();
        System.out.println(Arrays.toString(brands));
        System.out.println("===== 洗牌 =====");
        Brand[] shuffle = BrandUtil.shuffle();
        System.out.println(Arrays.toString(shuffle));
        System.out.println("===== 分牌 =====");
        List<Brand[]> deal = BrandUtil.deal(shuffle);
        for (int i = 0; i < deal.size(); i++) {
            Brand[] brands1 = deal.get(i);
            System.out.println(Arrays.toString(brands1));
        }
        System.out.println("===== 理牌 =====");
        BrandUtil.sort(shuffle);
        System.out.println(Arrays.toString(shuffle));
    }
}
