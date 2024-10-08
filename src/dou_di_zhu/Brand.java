package dou_di_zhu;

import dou_di_zhu.util.BrandUtil;

public class Brand implements Comparable<Brand> {
    private String design;
    private String number;
    private int integer;

    public Brand() {
    }

    public Brand(String design, String number) {
        this.design = design;
        this.number = number;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "design='" + design + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public int compareTo(Brand o) {
        return this.integer - o.integer;
    }
}
