package Day004;

public class Enemy0 {
    //敌对人物: 初始生命值也为2。敌对人物拥有不同的战斗风格和技能，对主角构成威胁。
    //防止一次致命伤害
    private int bool;

    public Enemy0() {
    }
    public Enemy0(int bool) {
        this.bool = bool;
    }

    public int getBool() {
        return bool;
    }

    public void setBool(int bool) {
        this.bool = bool;
    }

}
