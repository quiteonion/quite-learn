package dou_di_zhu;

import dou_di_zhu.util.BrandUtil;

public class Brand {
    private String design;
    private String number;

    public Brand(){
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

    @Override
    public String toString() {
        return "Brand{" +
                "design='" + design + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
