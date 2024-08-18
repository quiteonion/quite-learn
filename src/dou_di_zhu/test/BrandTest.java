package dou_di_zhu.test;

import dou_di_zhu.Brand;
import dou_di_zhu.util.BrandUtil;

import java.util.Arrays;

public class BrandTest {
    public static void main(String[] args) {
        Brand[] brands = BrandUtil.createBrands();
        System.out.println(Arrays.toString(brands));
        Brand[] shuffle = BrandUtil.shuffle();
        System.out.println(Arrays.toString(shuffle));
    }
}
