package A20240324.GoodOrBed;

public class Leadership {
    String name = "黑子";
    private String GB;


    public Leadership() {
    }

    public Leadership(String name, String GB) {
        this.GB = GB;
        this.name = name;
    }


    public String getGB() {
        return GB;
    }


    public void setGB(String GB) {
        if (GB.equals("不好")) {
            System.out.println("你怎么能这样子说呢？他有多努力你知道吗？？？");
            this.GB = "好";
            return;
        }
        this.GB = GB;
    }

    public void PJ(Leadership leadership) {
        if (leadership.getGB().equals("好")) {
            System.out.println("谢谢你支持我家哥哥！ji");
        }else {
            System.out.println("不可能不好的");
        }
    }

}
