package A20240131;

import java.util.Random;

public class Conbat {
    Random r = new Random();
    private String name;
    private String face;
    private int bool;
    private char sex;
    private String weapons;

    String[] FaceText = {
            "自惭形秽" +
                    "一表非凡的" +
                    "一表人才的" +
                    "以貌取人的" +
                    "鹰嘴鹞目的" +
                    "有眼无珠的" +
                    "玉质金相的" +
                    "心广体胖的" +
                    "虚有其表的" +
                    "心宽体胖的" +
                    "外宽内深的" +
                    "外巧内嫉的" +
                    "内峻外和的" +
                    "绵里藏针的" +
                    "貌如其心的" +
                    "口蜜腹剑的" +
                    "厚貌深情的" +
                    "才貌双全的" +
                    "鸡皮鹤发的" +
                    "眉清目秀的"
    };

    String[] WeaponText = {
                    "枪" +
                    "剑" +
                    "戟" +
                    "斧" +
                    "钺" +
                    "钩" +
                    "叉" +
                    "鞭" +
                    "锏" +
                    "锤" +
                    "挝" +
                    "镋" +
                    "棍" +
                    "槊" +
                    "棒" +
                    "拐" +
                    "流星锤"
    };

    String[] kongfu = {
            "%s%s挥舞长枪，正中%s面门",
            "%s%s一记右鞭腿，直冲%s天灵盖",
            "%s%s上去就张开了自己八二年的老黄牙，狠狠咬在%s的屁股上面",
            "%s%s用出一招【混元功法】，打得%s连退数步",
            "%s%s甩出几枚手里剑，直奔%s命脉而去",
            "%s%s一招i大威天龙，将%s拍在地上",
            "%s%s使出蛤蟆神功，头追顶向%s",
            "%s%s飞向空中，使出一招从天而降的掌法，拍了%s一下",
            "%s%s口中念念有词，口吐烈焰点燃%s"};

    String[] status = {
            "，%s被打，后退数十步，抖了抖身上的灰尘",
            "，给%s造成了一处瘀伤",
            "，一击命中，%s疼的弯下了腰",
            "，%s大叫起来，显然很疼",
            "，%s扶墙歇息，显然受到很严重的伤",
            "，%s脸色变得惨白，摇摇晃晃退了几步",
            "，只听轰隆的一声，%s口吐鲜血",
            "，%s哈哈哈大笑三声，竟也还是摇摇晃晃的站起身",
            "，%s捂头痛苦，快速起身",
            "，%s一声惨叫，如同软泥一般倒了下去",};
    public Conbat() {
    }

    public Conbat(String name, int bool, char sex) {
        this.name = name;
        this.bool = bool;
        this.sex = sex;

        int FaceNumber = r.nextInt(FaceText.length);
        this.face = FaceText[FaceNumber];


    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getFace() {
        return face;
    }

    public void setBool(int bool) {
        this.bool = bool;
    }

    public int getbool() {
        return bool;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getsex() {
        return sex;
    }


    public void attr(Conbat conbat){

    }

}
